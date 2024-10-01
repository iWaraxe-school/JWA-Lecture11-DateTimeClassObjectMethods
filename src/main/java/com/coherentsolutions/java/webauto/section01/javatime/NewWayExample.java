package com.coherentsolutions.java.webauto.section01.javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewWayExample {
    public static void main(String[] args) {
        // Current date and time using LocalDate, LocalTime, LocalDateTime
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);

        // Adding days to the current date
        LocalDate futureDate = currentDate.plusDays(5);
        System.out.println("Future Date: " + futureDate);

        // Formatting date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
