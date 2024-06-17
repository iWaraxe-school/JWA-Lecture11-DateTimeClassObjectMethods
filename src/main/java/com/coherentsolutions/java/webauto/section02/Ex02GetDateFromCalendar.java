package com.coherentsolutions.java.webauto.section02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Demonstrates how to get a Date object from a Calendar instance.
 */
public class Ex02GetDateFromCalendar {
    public static void main(String[] args) {
        // Create a calendar with the date January 25, 2017
        Calendar calendar = new GregorianCalendar(2017, 0, 25);

        // Get a Date object from the calendar
        Date date = calendar.getTime();

        // Print the date
        System.out.println("Date: " + date);
    }
}