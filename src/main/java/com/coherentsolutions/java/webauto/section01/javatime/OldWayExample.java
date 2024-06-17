package com.coherentsolutions.java.webauto.section01.javatime;

import java.util.Date;
import java.util.Calendar;

public class OldWayExample {
    public static void main(String[] args) {
        // Current date and time using Date
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        // Manipulating date using Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date: " + futureDate);
    }
}
