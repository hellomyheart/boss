package com.example.boss.service;

import com.example.boss.dto.UserDto;
import com.example.boss.dto.UserLoginDto;
import com.example.boss.entity.User;
import com.example.boss.vo.ResponseResult;

/**
 * @description
 * @className: UserService
 * @package: com.example.dingding.service
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:54
 */
public interface UserService {

    //校验手机号
    ResponseResult checkPhone(String phone);

    //校验用户名
    ResponseResult checkNickName(String nickname);

    //注册
    ResponseResult register(UserDto dto);

    //登录
    ResponseResult login(UserLoginDto loginDto);

    //找回密码
    ResponseResult find(String token,UserDto dto);
}
