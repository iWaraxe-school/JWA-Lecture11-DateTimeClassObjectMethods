package com.coherentsolutions.java.webauto.section02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates how to create a Calendar instance for a specific date.
 */
public class Ex01CreateCalendar {
    public static void main(String[] args) {
        // Create a calendar with the date January 25, 2017
        Calendar calendar = new GregorianCalendar(2017, 0, 25);

        // Print the calendar date
        System.out.println("Date: " + calendar.getTime());
    }
}