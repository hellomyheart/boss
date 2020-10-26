package com.example.boss.service.impl;

import com.example.boss.config.RedisKeyConfig;
import com.example.boss.service.SmsService;
import com.example.boss.third.JedisUtil;
import com.example.boss.third.SmsUtil;
import com.example.boss.util.NumRandomUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/22 23:11
 * @Description:
 */
@Service
public class SmsServiceImpl implements SmsService {


    @Override
    public ResponseResult sendRcode(String phone) {
        //生成验证码
        int code = NumRandomUtil.randomNum(6);
        //发送验证码
        if (SmsUtil.sendRCode(phone,code)) {
            //存储验证码
            JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.SMS_RCODE +phone,RedisKeyConfig.RCODE_TIME,code+"");
            //结果返回
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}
