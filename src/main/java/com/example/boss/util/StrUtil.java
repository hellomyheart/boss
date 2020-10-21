package com.example.boss.util;

/**
 * @description
 * @className: StrUtil
 * @package: cn.hellomyheart.kataba.util
 * @author: Stephen Shen
 * @date: 2020/10/19 下午3:49
 */
public class StrUtil {

    /**
     * 校验是否为空
     * @return true 非空  false 空*/
    public static boolean checkNoEmpty(String... strs){
        boolean result=true;
        for(String s:strs){
            if(s==null || s.length()==0){
                result=false;
                break;
            }
        }
        return result;
    }
}
