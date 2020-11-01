package com.example.boss.service;

import com.example.boss.dto.EmailRCodeDto;
import com.example.boss.vo.ResponseResult;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/11/1 13:13
 * @Description:
 */
public interface EmailService {
    //发送验证码
    ResponseResult sendRCode(String email);

    //检查验证码
    ResponseResult checkRCode(EmailRCodeDto dto);
}
