package com.example.boss.controller;

import com.example.boss.dto.EmailDto;
import com.example.boss.service.EmailService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/23 21:35
 * @Description:
 */
@RestController
@RequestMapping("/email/")
public class EmailController {
    @Autowired
    private EmailService service;

    @PostMapping("sendEmail")
    public ResponseResult sendEmail(EmailDto dto){
        return service.sendRCode(dto);
    }
}
