package com.example.boss.controller;

import com.example.boss.dto.ApplyInfoDto;
import com.example.boss.dto.UserDto;
import com.example.boss.service.ApplyinfoService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/11/1 15:05
 * @Description:
 */
@RestController
@RequestMapping("/apply/")
public class ApplyController {
    @Autowired
    private ApplyinfoService service;

    @PostMapping("register")
    public ResponseResult register(UserDto userDto, ApplyInfoDto dto){
        return service.register(userDto, dto);
    }
}
