package com.example.hotpot.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimesUtils {

    public static String getNowTimeByFormat(String format){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String nowTime = simpleDateFormat.format(date);
        return nowTime;
    }
}
