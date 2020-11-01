package com.example.boss.service.impl;

import com.example.boss.config.RedisKeyConfig;
import com.example.boss.dto.ApplyInfoDto;
import com.example.boss.dto.UserDto;
import com.example.boss.entity.User;
import com.example.boss.entity.UserLog;
import com.example.boss.mapper.UserLogMapper;
import com.example.boss.mapper.UserMapper;
import com.example.boss.third.JedisUtil;
import com.example.boss.util.EncryptUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.ApplyinfoMapper;
import com.example.boss.entity.Applyinfo;
import com.example.boss.service.ApplyinfoService;
@Service
public class ApplyinfoServiceImpl extends ServiceImpl<ApplyinfoMapper, Applyinfo> implements ApplyinfoService{
    @Autowired
    private UserMapper mapper;
    @Autowired
    private UserLogMapper logMapper;
    @Autowired
    private ApplyinfoMapper applyinfoMapper;


    @Value("${boss.passkey}")
    private String pk;

    @Override
    public ResponseResult register(UserDto userDto, ApplyInfoDto dto) {
        User user = mapper.selectByPhone(userDto.getPhone());
        if(user==null) {
            //验证码比对
            if (userDto.getMsgCode().equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + userDto.getPhone()))) {
                //密码 密文 AES
                userDto.setPassword(EncryptUtil.aesenc(pk, userDto.getPassword()));
                //新增
                User u2 = new User(userDto.getPhone(), userDto.getEmail(), userDto.getPassword(), userDto.getNickname(), userDto.getIcon(), 1, new Date(), new Date());
                if (mapper.insert(u2)>0){
                    Applyinfo applyinfo = new Applyinfo(u2.getId(), dto.getSpId(), 1);
                    if (applyinfoMapper.insert(applyinfo)>0){
                        UserLog userLog = new UserLog(u2.getId(), new Date(), "add", u2.getNickname()+"注册成为新用户");
                        logMapper.insert(userLog);
                        return ResponseResult.ok();
                    }
                }
            }
        }
        return ResponseResult.fail();
    }
}
