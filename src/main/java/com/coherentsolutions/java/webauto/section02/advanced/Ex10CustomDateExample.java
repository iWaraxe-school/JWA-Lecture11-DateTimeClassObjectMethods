package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates creating and manipulating a custom date using Calendar.
 */
public class Ex10CustomDateExample {
    public static void main(String[] args) {
        // Create a custom date (December 31, 2020)
        Calendar customDate = new GregorianCalendar(2020, Calendar.DECEMBER, 31);

        // Print the custom date
        System.out.println("Custom Date: " + customDate.getTime());

        // Add 1 day to the custom date
        customDate.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Custom Date after adding 1 day: " + customDate.getTime());

        // Subtract 2 months from the custom date
        customDate.add(Calendar.MONTH, -2);
        System.out.println("Custom Date after subtracting 2 months: " + customDate.getTime());

        // Get and print the year, month, and day of the custom date
        int year = customDate.get(Calendar.YEAR);
        int month = customDate.get(Calendar.MONTH);
        int day = customDate.get(Calendar.DAY_OF_MONTH);

        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Adding 1 because months are zero-based
        System.out.println("Day: " + day);
    }
}