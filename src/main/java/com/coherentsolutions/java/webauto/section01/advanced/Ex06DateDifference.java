package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.Date;

/**
 * Demonstrates how to calculate the difference between two dates.
 */
public class Ex06DateDifference {
    public static void main(String[] args) {
        try {
            Date startDate = new Date();
            Thread.sleep(5000); // Sleep for 5 seconds
            Date endDate = new Date();

            long differenceInMilliseconds = endDate.getTime() - startDate.getTime();
            long differenceInSeconds = differenceInMilliseconds / 1000;
            long differenceInMinutes = differenceInSeconds / 60;

            System.out.println("Difference in milliseconds: " + differenceInMilliseconds);
            System.out.println("Difference in seconds: " + differenceInSeconds);
            System.out.println("Difference in minutes: " + differenceInMinutes);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }
}