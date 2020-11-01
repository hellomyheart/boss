package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.config.RedisKeyConfig;
import com.example.boss.dto.UserDto;
import com.example.boss.dto.UserLoginDto;
import com.example.boss.dto.UserUpdateDto;
import com.example.boss.entity.User;
import com.example.boss.entity.UserLog;
import com.example.boss.mapper.UserLogMapper;
import com.example.boss.mapper.UserMapper;
import com.example.boss.service.UserService;
import com.example.boss.third.JedisUtil;
import com.example.boss.third.JwtUtil;
import com.example.boss.util.EncryptUtil;
import com.example.boss.util.StrUtil;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private UserLogMapper logMapper;

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
                //存在-昵称不可用
                return ResponseResult.fail();
            }else{
                //不存在-昵称可用
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult register(UserDto dto) {
        //校验是否可用
        User user = mapper.selectByNamePhone(dto.getNickname(), dto.getPhone());
        if (user == null) {
            //验证码比对
            if (dto.getMsgCode().equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + dto.getPhone()))){
                //密码加密 AES
                dto.setPassword(EncryptUtil.aesenc(pk,dto.getPassword()));
                //新增
                User u2 = new User(dto.getPhone(), dto.getEmail(), dto.getPassword(), dto.getNickname(), dto.getIcon(), 1, new Date(), new Date());
                if (mapper.insert(u2)>0) {
                    //记录日志
                    UserLog userLog = new UserLog(u2.getId(), new Date(), "add", u2.getNickname() + "完成注册，成为新用户");
                    logMapper.insert(userLog);
                    return ResponseResult.ok();
                }
            }
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult login(UserLoginDto dto) {
        User user = mapper.selectByPhone(dto.getPhone());
        if (user != null) {
            //比较密码
            if (EncryptUtil.aesenc(pk,dto.getPassword()).equals(user.getPassword())){
                //密码一致，生成令牌
                String token = JwtUtil.createToken(user.getPhone());
                //存储令牌
                //记录令牌 对应的用户
                JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.LOGIN_TOKEN + token,RedisKeyConfig.LOGIN_TIME,new JSONObject(user).toString());
                //记录登录过的账号信息
                JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.LOGIN_USER + user.getId(),RedisKeyConfig.LOGIN_TIME,token);
                //记录日志
                UserLog userLog = new UserLog(user.getId(), new Date(), "login", user.getNickname() + "登录");
                logMapper.insert(userLog);
                //返回结果
                return ResponseResult.ok(token);
            }
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult findPwd(String email, String code, String password) {
        User user = mapper.selectByEmail(email);
        if (user != null) {
            //验证码比对
            if (code.equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + email))){
                //密文加密
                String newPassword = EncryptUtil.aesenc(pk, password);
                if (mapper.findPwd(email,newPassword)>0){
                    //记录日志
                    UserLog userLog = new UserLog(user.getId(), new Date(), "update", user.getNickname() + "找回密码");
                    logMapper.insert(userLog);
                    return ResponseResult.ok();
                }
            }
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult update(String token, String code, String email, String password) {
        int uid = TokenUtil.getUid(token);
        if (code.equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + email))){
            //密文AES加密
            String newPassword = EncryptUtil.aesenc(pk,password);
            if (mapper.updatePwd(uid,newPassword)>0){
                //记录日志
                UserLog userLog = new UserLog(uid, new Date(), "update", uid + "修改密码");
                logMapper.insert(userLog);
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult updateInfo(String token, UserUpdateDto dto) {
        int uid = TokenUtil.getUid(token);
        User user = new User(uid, dto.getEmail(), dto.getIcon(), dto.getNickname(), new Date());
        if (mapper.updateById(user)>0){
            //记录日志
            UserLog userLog = new UserLog(uid, new Date(), "update", uid + "修改个人信息");
            logMapper.insert(userLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }


}

