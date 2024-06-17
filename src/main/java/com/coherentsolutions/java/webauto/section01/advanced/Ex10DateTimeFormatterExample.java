package com.coherentsolutions.java.webauto.section01.advanced;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates formatting of date and time using DateTimeFormatter.
 */
public class Ex10DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}