package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates how to subtract time from a date using Calendar.
 */
public class Ex09SubtractTimeFromDate {
    public static void main(String[] args) {
        // Create a calendar with the current date and time
        Calendar calendar = new GregorianCalendar();

        // Subtract 10 days from the current date
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("Date after subtracting 10 days: " + calendar.getTime());

        // Subtract 2 months from the current date
        calendar.add(Calendar.MONTH, -2);
        System.out.println("Date after subtracting 2 months: " + calendar.getTime());

        // Subtract 5 years from the current date
        calendar.add(Calendar.YEAR, -5);
        System.out.println("Date after subtracting 5 years: " + calendar.getTime());
    }
}