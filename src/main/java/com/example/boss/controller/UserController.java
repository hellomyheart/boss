package com.example.boss.controller;

import com.example.boss.dto.UserDto;
import com.example.boss.dto.UserLoginDto;
import com.example.boss.dto.UserUpdateDto;
import com.example.boss.service.UserService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description
 * @className: UserController
 * @package: com.example.dingding.controller
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:34
 */
@RestController
//yml中配置了统一前缀
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService service;

    /**
     * 校验手机号是否可用
     * @param phone
     * @return
     */
    @GetMapping("checkPhone")
    public ResponseResult checkPhone(String phone){
        return service.checkPhone(phone);
    }

    /**
     * 校验用户名是否可用
     * @param nickname
     * @return
     */
    @GetMapping("checkNickName")
    public ResponseResult checkNickName(String nickname){
        return service.checkNickName(nickname);
    }

    /**
     * 注册
     * @param dto
     * @return
     */
    @PostMapping("register")
    public ResponseResult register(UserDto dto){
        return service.register(dto);
    }

    /**
     * 登录
     * @param loginDto
     * @return
     */
    @PostMapping("login")
    public ResponseResult login(@RequestBody UserLoginDto loginDto){
        return service.login(loginDto);
    }

    /**
     * 找回密码
     * @param email
     * @param code
     * @param newPassword
     * @return
     */
    @GetMapping("findPwd")
    public ResponseResult findPwd(String email,String code ,String newPassword){
        return service.find(email, code, newPassword);
    }

    /**
     * 修改密码
     * @param token
     * @param code
     * @param email
     * @param password
     * @return
     */
    @GetMapping("updatePwd")
    public ResponseResult updatePwd(String token, String code, String email, String password){
        return service.update(token, code, email, password);
    }

    /**
     * 修改个人信息
     * @param id
     * @param dto
     * @return
     */
    @PostMapping("modify")
    public ResponseResult modify(Integer id, UserUpdateDto dto){
        return service.modify(id, dto);
    }
}
