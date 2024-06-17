package com.coherentsolutions.java.webauto.section01.advanced;

import java.time.LocalTime;

/**
 * Demonstrates the usage of LocalTime from the java.time package.
 */
public class Ex08LocalTimeExample {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        System.out.println("Current Time: " + currentTime);
    }
}