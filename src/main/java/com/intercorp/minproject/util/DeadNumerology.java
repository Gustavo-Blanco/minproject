package com.intercorp.minproject.util;

import java.util.*;

/*
* Reference to numerology
* https://eurodomik.ru/es/calculation/tochnoe-predskazanie-moei-smerti-kak-rasschitat-datu-svoei-smerti-po-date.html
* */
public class DeadNumerology {

    //depends on the key, the year of dead change by one of the values in the list
    public Map<Integer, List<Integer>> numberStop = new HashMap<>() {{
        put(1, List.of(80));
        put(2, List.of(7, 19, 29, 45, 67));
        put(3, List.of(44));
        put(4, List.of(100));
        put(5, List.of(3, 15, 24, 48, 62, 76));
        put(6, List.of(13, 22, 47, 68));
        put(7, List.of(24, 36, 61));
        put(8, List.of(80));
        put(9, List.of(16, 23, 38, 47));
    }};

    public Date getMaxDate (Integer key, Date date) {
        List<Integer> values = this.numberStop.get(key);
        Integer maxYear = values.get(getRandomNumber(0,values.size() - 1));
        Integer birthYear = Integer.parseInt(DateFormat.formatDate("yyyy", date));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, birthYear + maxYear);
        return calendar.getTime();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
