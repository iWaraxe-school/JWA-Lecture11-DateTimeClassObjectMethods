package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.GregorianCalendar;

/**
 * Demonstrates how to check if a year is a leap year using GregorianCalendar.
 */
public class Ex07LeapYearCheck {
    public static void main(String[] args) {
        // Check if a specific year is a leap year
        int year = 2020;
        GregorianCalendar calendar = new GregorianCalendar();
        boolean isLeapYear = calendar.isLeapYear(year);

        System.out.println("Year " + year + " is a leap year: " + isLeapYear);
    }
}