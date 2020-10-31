package com.example.boss.service;

import com.example.boss.dto.SmsRCodeDto;
import com.example.boss.vo.ResponseResult;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/31 21:50
 * @Description:
 */
public interface SmsService {

    //发送验证码
    ResponseResult sendRCode(String phone);

    //检查验证码
    ResponseResult checkRCode(SmsRCodeDto dto);
}
