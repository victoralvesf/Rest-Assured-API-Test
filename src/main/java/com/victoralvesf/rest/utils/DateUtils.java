package com.victoralvesf.rest.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String getDateWithDayDifference(Integer daysToAdd) {
        LocalDate futureDate = LocalDate.now().plusDays(daysToAdd);

        return formatDate(futureDate);
    }

    private static String formatDate(LocalDate date) {
        DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return date.format(defaultFormat);
    }
}
