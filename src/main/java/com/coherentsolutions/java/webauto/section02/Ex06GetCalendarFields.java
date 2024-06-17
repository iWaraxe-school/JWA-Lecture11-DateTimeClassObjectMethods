package com.coherentsolutions.java.webauto.section02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates how to get individual fields from a Calendar instance.
 */
public class Ex06GetCalendarFields {
    public static void main(String[] args) {
        // Create a calendar with the date January 25, 2017
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);

        // Get and print individual fields
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Adding 1 because months are zero-based
        System.out.println("Day: " + day);
    }
}