package com.coherentsolutions.java.webauto.section01;

import java.util.Date;

/**
 * Demonstrates how to get the current date and time using the Date class.
 */
public class Ex01CurrentDateAndTime {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(1_000_000_000_000L);

        // Print the current date and time using toString()
        System.out.println(date1.toString());
        System.out.println(date2.toString());
    }
}
