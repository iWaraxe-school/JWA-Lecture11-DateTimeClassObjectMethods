package com.coherentsolutions.java.webauto.section03.advanced.ex4;

/**
 * Demonstrates the toString() method.
 */
public class Ex04ToStringMethod {
    public static void main(String[] args) {
        Developer developer = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);
        System.out.println(developer);
    }
}

class Developer {
    private String name;
    private String lastName;
    private int age;
    private Position position;
    private double salary;
    private DeveloperType type;

    public Developer(String name, String lastName, int age, Position position, double salary, DeveloperType type) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position=" + position +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }
}

enum Position {
    DEVELOPER, MANAGER
}

enum DeveloperType {
    BACK_END, FRONT_END
}
