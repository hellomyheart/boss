package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.boss.config.RedisKeyConfig;
import com.example.boss.dto.UserDto;
import com.example.boss.dto.UserLoginDto;
import com.example.boss.entity.User;
import com.example.boss.mapper.UserMapper;
import com.example.boss.service.UserService;
import com.example.boss.third.JedisUtil;
import com.example.boss.third.JwtUtil;
import com.example.boss.util.EncryptUtil;
import com.example.boss.util.StrUtil;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import com.google.gson.JsonObject;
import jdk.nashorn.internal.parser.Token;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @description
 * @className: UserServiceImpl
 * @package: com.example.dingding.service.impl
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:55
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Value("${boss.passkey}")
    private String pk;

    @Override
    public ResponseResult checkPhone(String phone) {
        if (StrUtil.checkNoEmpty(phone)) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("phone",phone);
            if (mapper.selectOne(queryWrapper) != null) {
                //存在-手机号不可用
                return ResponseResult.fail();
            }else{
                //不存在-手机号可用
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult checkNickName(String nickname) {
        if (StrUtil.checkNoEmpty(nickname)) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("nickname",nickname);
            if (mapper.selectOne(queryWrapper) != null) {
                //存在-不可用
                return ResponseResult.fail();
            }else{
                //不存在-可用
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult register(UserDto dto) {
        //校验是否可用
        User user=mapper.selectByNamePhone(dto.getNickname(),dto.getPhone());
        if(user==null) {
            //验证码比对
            if (dto.getMsgCode().equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + dto.getPhone()))) {
                //密码 密文 AES
                dto.setPassword(EncryptUtil.aesenc(pk, dto.getPassword()));
                //新增
                User u2 = new User(dto.getPhone(), dto.getNickname(), dto.getPassword(), dto.getEmail(), 1, new Date());
                mapper.insert(u2);
            }
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult login(UserLoginDto loginDto) {
        //校验
        User user = mapper.selectByName(loginDto.getName());
        if (user != null) {
            //比较密码  密文
            if (EncryptUtil.aesenc(pk,loginDto.getPassword()).equals(user.getPassword())){
                //密码一致
                //生成令牌
                String token = JwtUtil.createToken(user.getPhone());
                System.out.println("token = " + token);
                //存储令牌
                //记录令牌 对应的用户
                JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.LOGIN_TOKEN + token , RedisKeyConfig.LOGIN_TIME , new JSONObject(user).toString());
                //记录登录过的账号信息
                JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.LOGIN_USER+user.getId(),RedisKeyConfig.LOGIN_TIME,token);
                //返回结果
                return ResponseResult.ok(token);
            }
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult find(String email,String code,String password) {
        //校验
        User user = mapper.selectByEmail(email);
        if (user != null) {
            //比对
            if (code.equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + email))) {
                String newPassword = EncryptUtil.aesenc(pk,password);
                mapper.findPwd(email, newPassword);
                return ResponseResult.ok();
            }
            return ResponseResult.fail();
        }

        return ResponseResult.fail();
    }

    @Override
    public ResponseResult update(String token, String code, String email, String password) {
        int uid = TokenUtil.getUid(token);
        if (code.equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + email))){
            String newPassword = EncryptUtil.aesenc(pk,password);
            mapper.updatePwd(uid,newPassword);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

}
