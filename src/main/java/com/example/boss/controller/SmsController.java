package com.example.boss.controller;

import com.example.boss.dto.SmsRCodeDto;
import com.example.boss.service.SmsService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("sendRCode/{phone}")
    public ResponseResult sendRCode(@PathVariable String phone){
        return service.sendRcode(phone);
    }

    @PostMapping("checkRCode")
    public ResponseResult checkRCode(SmsRCodeDto dto){
        return service.checkRCode(dto);
    }
}
