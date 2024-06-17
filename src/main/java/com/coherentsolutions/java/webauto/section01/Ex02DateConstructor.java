package com.coherentsolutions.java.webauto.section01;

import java.util.Date;

/**
 * Demonstrates the use of Date constructors.
 */
public class Ex02DateConstructor {
    public static void main(String[] args) {
        // Current date and time
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate.toString());

        // Date from milliseconds
        long milliseconds = 1212121212121L;
        Date specificDate = new Date(milliseconds);
        System.out.println("Date from milliseconds: " + specificDate.toString());
    }
}
