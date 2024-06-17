package com.coherentsolutions.java.webauto.section02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates how to set various fields of a Calendar instance.
 */
public class Ex04SetCalendarFields {
    public static void main(String[] args) {
        // Create a calendar and set various fields
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 19);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        // Print the calendar date
        System.out.println("Date: " + calendar.getTime());
    }
}