package com.example.boss.util;

import java.util.Random;

/**
 * @description
 * @className: NumRandomUtil
 * @package: cn.hellomyheart.kataba.util
 * @author: Stephen Shen
 * @date: 2020/10/20 上午11:35
 */
public class NumRandomUtil {
    //生成随机数字，指定位数
    public static int randomNum(int len) {
        Random random = new Random();
        double d = Math.pow(10, len - 1);
        return random.nextInt((int) (Math.pow(10, len) - d)) + (int) d;
    }
}
