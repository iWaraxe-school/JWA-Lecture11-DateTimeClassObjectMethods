package com.coherentsolutions.java.webauto.section02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Demonstrates the use of Calendar constants for better readability.
 */
public class Ex03UseConstants {
    public static void main(String[] args) {
        // Create a calendar with the date January 25, 2017 using constants
        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);

        // Print the calendar date
        System.out.println("Date: " + calendar.getTime());
    }
}