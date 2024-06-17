package com.coherentsolutions.java.webauto.section03.advanced.ex3;

import java.util.Objects;

/**
 * Demonstrates the hashCode() method.
 */
public class Ex03HashCodeMethod {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);
        Developer developer2 = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);

        System.out.println("Hash code of Developer 1: " + developer1.hashCode());
        System.out.println("Hash code of Developer 2: " + developer2.hashCode());
    }
}

class Developer extends Object {
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
    public int hashCode() {
        return Objects.hash(name, lastName, age, position, salary, type);
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
