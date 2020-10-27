package com.example.boss.service;

import com.example.boss.dto.EmailDto;
import com.example.boss.dto.EmailRCodeDto;
import com.example.boss.vo.ResponseResult;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/23 21:04
 * @Description:
 */
public interface EmailService {
    //发送验证码
    ResponseResult sendRCode(EmailDto dto);

    //检查验证码
    ResponseResult checkRCode(EmailRCodeDto dto);
}
