package com.example.boss.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.example.boss.config.RedisKeyConfig;
import com.example.boss.dto.SmsRCodeDto;
import com.example.boss.service.SmsService;
import com.example.boss.third.JedisUtil;
import com.example.boss.third.SmsUtil;
import com.example.boss.util.NumRandomUtil;
import com.example.boss.util.StrUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public ResponseResult checkRCode(SmsRCodeDto dto) {
        if (StrUtil.checkNoEmpty(dto.getPhone())) {
            String  code = RedisKeyConfig.SMS_RCODE + dto.getPhone();
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
