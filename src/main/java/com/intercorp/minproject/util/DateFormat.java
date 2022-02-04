package com.intercorp.minproject.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static String formatDate (String format, Date date){
        return new SimpleDateFormat(format).format(date);
    }
}
