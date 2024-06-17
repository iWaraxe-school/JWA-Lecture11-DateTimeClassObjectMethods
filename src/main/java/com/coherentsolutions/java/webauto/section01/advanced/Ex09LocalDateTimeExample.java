package com.coherentsolutions.java.webauto.section01.advanced;

import java.time.LocalDateTime;

/**
 * Demonstrates the usage of LocalDateTime from the java.time package.
 */
public class Ex09LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date and Time: " + currentDateTime);
    }
}