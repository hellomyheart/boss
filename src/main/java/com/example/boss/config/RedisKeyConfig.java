package com.example.boss.config;

/**
 * @description Redis配置类
 * @className: RedisKeyConfig
 * @package: cn.hellomyheart.kataba.config
 * @author: Stephen Shen
 * @date: 2020/10/19 下午3:41
 */
public class RedisKeyConfig {
    //注册验证码 String  有效期10
    //后面追加手机号
    public static final String SMS_RCODE="boss:sms:rcode:";
    //单位秒
    public static final int RCODE_TIME=600;
    //存储令牌
    public static final String LOGIN_TOKEN="boss:login:token:";//追加令牌

    public static final String LOGIN_USER="boss:login:uid:";//追加用户id

    public static final int LOGIN_TIME=1800;//单位秒
}
