package com.example.boss.controller;

import com.example.boss.dto.UserDto;
import com.example.boss.service.UserService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
