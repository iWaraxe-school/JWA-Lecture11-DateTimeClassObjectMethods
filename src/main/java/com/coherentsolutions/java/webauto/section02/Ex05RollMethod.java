package com.coherentsolutions.java.webauto.section02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates the use of the roll method in Calendar.
 */
public class Ex05RollMethod {
    public static void main(String[] args) {
        // Create a calendar with the date January 25, 2017
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);

        // Set the time fields
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        // Roll the month back by 2 months
        calendar.roll(Calendar.MONTH, -2);

        // Print the calendar date
        System.out.println("Date after roll: " + calendar.getTime());
    }
}