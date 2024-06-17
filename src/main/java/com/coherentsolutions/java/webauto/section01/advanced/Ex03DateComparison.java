package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.Date;

/**
 * Demonstrates how to compare dates using different methods.
 */
public class Ex03DateComparison {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1.getTime());
        Date date2 = new Date(date1.getTime() - 10000); // 10 seconds before date1

        // Using getTime() to compare
        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Date1 after Date2: " + date1.after(date2));
        System.out.println("Date1 before Date2: " + date1.before(date2));
        System.out.println("Date1 equals Date2: " + date1.equals(date2));
    }
}