package com.coherentsolutions.java.webauto.section01.advanced;

import java.time.LocalDate;

/**
 * Demonstrates the usage of LocalDate from the java.time package.
 */
public class Ex07LocalDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate specificDate = LocalDate.of(1995, 1, 5);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Specific Date: " + specificDate);
    }
}