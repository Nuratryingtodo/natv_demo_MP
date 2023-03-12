package com.example.natv_demoMP2.Utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    private static DateUtil INSTANCE;

    public static DateUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DateUtil();
        }
        return INSTANCE;
    }

    public Date getEndDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.MONTH, 11); // months are 0-based, so December is 11
        calendar.set(Calendar.YEAR, 2999);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();}







}
