package com.example.boss.util;

import com.example.boss.config.RedisKeyConfig;
import com.example.boss.third.JedisUtil;
import org.json.JSONObject;

public class TokenUtil {

    //根据令牌获取当前用户的id
    public static int getUid(String token){
        return new JSONObject(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.LOGIN_TOKEN+token)).getInt("id");
    }

}
