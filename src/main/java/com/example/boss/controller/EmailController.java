package com.example.boss.controller;

import com.example.boss.dto.EmailRCodeDto;
import com.example.boss.service.EmailService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/11/1 13:19
 * @Description:
 */
@RestController
@RequestMapping("/email/")
public class EmailController {
    @Autowired
    private EmailService service;

    /**
     * 发送邮箱验证码
     * @param email
     * @return
     */
    @PostMapping("sendEmail/{email}")
    public ResponseResult sendEmail(@PathVariable String email){
        return service.sendRCode(email);
    }

    /**
     * 校验邮箱验证码
     * @param dto
     * @return
     */
    @PostMapping("checkRCode")
    public ResponseResult checkRCode(EmailRCodeDto dto){
        return service.checkRCode(dto);
    }
}
