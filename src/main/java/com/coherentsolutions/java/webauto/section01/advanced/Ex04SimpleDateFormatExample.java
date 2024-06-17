package com.coherentsolutions.java.webauto.section01.advanced;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Demonstrates how to format dates using SimpleDateFormat.
 */
public class Ex04SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E MM/dd/yyyy 'at' hh:mm:ss a zzz");

        // Format current date and time
        String formattedDate = formatter.format(now);
        System.out.println(now.toString() + ": unformatted");
        System.out.println("Formatted Date: " + formattedDate);
    }
}