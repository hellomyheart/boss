package com.example.boss.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.example.boss.config.RedisKeyConfig;
import com.example.boss.dto.EmailDto;
import com.example.boss.service.EmailService;
import com.example.boss.third.JedisUtil;
import com.example.boss.util.EmailUtil;
import com.example.boss.util.NumRandomUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.stereotype.Service;


/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/23 21:27
 * @Description:
 */
@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public ResponseResult sendRCode(EmailDto dto) {
        //生成验证码
        int code = NumRandomUtil.randomNum(6);
        //发送验证码
        if (EmailUtil.sendEmail(dto.getEmail(),dto.getTitle(),dto.getContent(),code)){
            System.out.println("code = " + code);
            //存储验证码
            JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.SMS_RCODE + dto.getEmail(), RedisKeyConfig.RCODE_TIME, code + "");
            //结果返回
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

}
