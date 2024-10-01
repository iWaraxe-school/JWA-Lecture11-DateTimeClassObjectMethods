package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates various methods of the Object class.
 */
public class Ex02ObjectMethods {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);
        Developer developer2 = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);


        // toString() method
        System.out.println("Developer 1: " + developer1);
        System.out.println("Developer 2: " + developer2.toString());

        // ==
        System.out.println(developer1 == developer2);
        // equals() method
        System.out.println("Developer 1 equals Developer 2: " + developer1.equals(developer2));

        // getClass() method
        System.out.println("Class of Developer 1: " + developer1.getClass());

        // hashCode() method
        System.out.println("Hash code of Developer 1: " + developer1.hashCode());
    }
}
