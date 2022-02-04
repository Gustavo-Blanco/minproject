package com.intercorp.minproject.components.user.useCase;

import com.intercorp.minproject.util.DateFormat;
import com.intercorp.minproject.util.DeadNumerology;

import java.util.Date;
import java.util.stream.Stream;

public class DeadDay {

    //get the number from 1 to 9 by the date
    public Integer calcDateNumerology(Date date) {

        String stringDate = DateFormat.formatDate("dd/mm/yyyy", date);
        String replaced = stringDate.replaceAll("/", "");
        Integer sumTotal = 11;
        String numberToSum = replaced;
        while (sumTotal >= 10){
            sumTotal = transformString(numberToSum, "");
            numberToSum = sumTotal.toString();
        }
        return sumTotal;
    }

    //get the dead date in string format dd/mm/yyyy
    public String calcDeadDate(Date date){
        Integer deadNumber = calcDateNumerology(date);
        Date deadDate = new DeadNumerology().getMaxDate(deadNumber, date);
        return DateFormat.formatDate("dd/mm/yyyy", deadDate);
    }

    // Sum the numbers of string date
    public Integer transformString(String s, String split) {
        return Stream.of(s.split(split))
                .map(Integer::parseInt)
                .reduce(Integer::sum).get();
    }
}
