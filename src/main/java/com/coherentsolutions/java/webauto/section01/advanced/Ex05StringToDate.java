package com.coherentsolutions.java.webauto.section01.advanced;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Demonstrates how to parse a string into a Date.
 */
public class Ex05StringToDate {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2024-06-12";

        try {
            Date parsedDate = formatter.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Failed to parse date: " + dateString);
        }
    }
}