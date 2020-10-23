package com.example.boss.test;

import com.example.boss.third.SmsUtil;
import com.example.boss.util.NumRandomUtil;
import org.junit.jupiter.api.Test;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/22 23:37
 * @Description:
 */
public class Sms_Test {
    @Test
    public void t1(){
        int c= NumRandomUtil.randomNum(6);
        System.out.println(c);
        SmsUtil.sendRCode("17634861405",c);
    }
}
