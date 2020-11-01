package com.example.boss.util;

import com.example.boss.config.RedisKeyConfig;
import com.example.boss.third.JedisUtil;
import org.json.JSONObject;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/11/1 13:43
 * @Description:
 */
public class TokenUtil {
    //获取用户id
    public static int getUid(String token){
        return new JSONObject(JedisUtil.getInstance().STRINGS.
                get(RedisKeyConfig.LOGIN_TOKEN+token)).getInt("id");
    }
}
