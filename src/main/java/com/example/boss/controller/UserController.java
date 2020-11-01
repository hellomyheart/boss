package com.example.boss.controller;

import com.example.boss.config.SystemConfig;
import com.example.boss.dto.UserDto;
import com.example.boss.dto.UserLoginDto;
import com.example.boss.service.UserService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
     * 检查手机号是否可用
     * @param phone
     * @return
     */
    @GetMapping("checkPhone")
    public ResponseResult checkPhone(String phone){
        return service.checkPhone(phone);
    }

    /**
     * 检查昵称是否可用
     * @param nickname
     * @return
     */
    @GetMapping("checkNickName")
    public ResponseResult checkNickName(String nickname){
        return service.checkNickName(nickname);
    }

    /**
     * 求职者注册
     * @param dto
     * @return
     */
    @PostMapping("register")
    public ResponseResult register(UserDto dto){
        return service.register(dto);
    }

    /**
     * 用户登录
     * @param dto
     * @return
     */
    @PostMapping("login")
    public ResponseResult login(UserLoginDto dto){
        return service.login(dto);
    }

    /**
     * 找回密码
     * @param email
     * @param code
     * @param newPassword
     * @return
     */
    @PostMapping("findPassword")
    public ResponseResult findPassword(String email,String code ,String newPassword){
        return service.findPwd(email, code, newPassword);
    }

    /**
     * 修改密码
     * @param request
     * @param code
     * @param email
     * @param password
     * @return
     */
    @GetMapping("updatePwd")
    public ResponseResult updatePwd(HttpServletRequest request, String code, String email, String password){
        return service.update(request.getHeader(SystemConfig.TOKEN_HEADER), code, email, password);
    }
}
