package com.example.boss.controller;

import com.example.boss.dto.EmailRCodeDto;
import com.example.boss.service.EmailService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("sendEmail/{email}")
    public ResponseResult sendEmail(@PathVariable String email){
        return service.sendRCode(email);
    }

    @PostMapping("checkRCode")
    public ResponseResult checkRCode(EmailRCodeDto dto){
        return service.checkRCode(dto);
    }
}
