package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates how to add time to a date using Calendar.
 */
public class Ex08AddTimeToDate {
    public static void main(String[] args) {
        // Create a calendar with the current date and time
        Calendar calendar = new GregorianCalendar();

        // Add 10 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Date after adding 10 days: " + calendar.getTime());

        // Add 2 months to the current date
        calendar.add(Calendar.MONTH, 2);
        System.out.println("Date after adding 2 months: " + calendar.getTime());

        // Add 5 years to the current date
        calendar.add(Calendar.YEAR, 5);
        System.out.println("Date after adding 5 years: " + calendar.getTime());
    }
}