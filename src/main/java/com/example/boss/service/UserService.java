package com.example.boss.service;

import com.example.boss.dto.UserDto;
import com.example.boss.dto.UserLoginDto;
import com.example.boss.vo.ResponseResult;

/**
 * @description
 * @className: UserService
 * @package: com.example.dingding.service
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:54
 */
public interface UserService {
    //检查手机号是否可用
    ResponseResult checkPhone(String phone);

    //检查昵称是否可用
    ResponseResult checkNickName(String nickname);

    //注册
    ResponseResult register(UserDto dto);

    //登录
    ResponseResult login(UserLoginDto dto);

    //找回密码
    ResponseResult findPwd(String email,String code,String password);
}

