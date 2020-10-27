package com.example.boss.service;

import com.example.boss.dto.SmsRCodeDto;
import com.example.boss.vo.ResponseResult;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/22 23:10
 * @Description:
 */
public interface SmsService {
    //发送注册验证码
    ResponseResult sendRcode(String phone);

    //检查验证码
    ResponseResult checkRCode(SmsRCodeDto dto);
}
