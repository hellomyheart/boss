package com.example.boss.util;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @description
 * @className: DateUtil
 * @package: com.example.boss.util
 * @author: Stephen Shen
 * @date: 2020/10/31 上午9:22
 */
public class DateUtil {
    //针对时间
    public static Date addTime(int add, TimeUnit tu){
        Calendar calendar=Calendar.getInstance();

        switch (tu){
            case DAYS:calendar.add(Calendar.DAY_OF_MONTH,add);break;
            case MINUTES:calendar.add(Calendar.MINUTE,add);break;
            case SECONDS:calendar.add(Calendar.SECOND,add);break;
        }
        return calendar.getTime();
    }
    /**
     * 获取日期
     * @param add 要添加的日期
     * @param type 类型 1年  2月 3日*/
    public static Date addTime(int add, int type){
        Calendar calendar=Calendar.getInstance();

        switch (type){
            case 1:calendar.add(Calendar.YEAR,add);break;
            case 2:calendar.add(Calendar.MONTH,add);break;
            case 3:calendar.add(Calendar.DAY_OF_MONTH,add);break;
        }
        return calendar.getTime();
    }


}
