package com.example.boss.controller;

import com.example.boss.service.SmsService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/22 23:25
 * @Description:
 */
@RestController
@RequestMapping("/sms/")
public class SmsController {
    @Autowired
    private SmsService service;

    @GetMapping("sendRCode")
    public ResponseResult sendRCode(String phone){
        return service.sendRcode(phone);
    }
}
