package com.example.boss.service.impl;

import com.example.boss.config.RedisKeyConfig;
import com.example.boss.dto.EmailRCodeDto;
import com.example.boss.service.EmailService;
import com.example.boss.third.JedisUtil;
import com.example.boss.util.EmailUtil;
import com.example.boss.util.NumRandomUtil;
import com.example.boss.util.StrUtil;
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
    public ResponseResult sendRCode(String email) {
        //生成验证码
        int code = NumRandomUtil.randomNum(6);
        //发送验证码
        if (EmailUtil.sendEmail(email,code)){
            //存储验证码
            JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.SMS_RCODE + email, RedisKeyConfig.RCODE_TIME, code + "");
            //结果返回
            return ResponseResult.ok(code);
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult checkRCode(EmailRCodeDto dto) {
        if (StrUtil.checkNoEmpty(dto.getEmail())) {
            String code = RedisKeyConfig.SMS_RCODE + dto.getEmail();
            //校验验证码是否失效
            if (JedisUtil.getInstance().getJedis().exists(code)) {
                //校验验证码是否一致
                if (dto.getCode() == Integer.parseInt(JedisUtil.getInstance().STRINGS.get(code))) {
                    return ResponseResult.ok();
                }
            }
        }
        return ResponseResult.fail();
    }

}
