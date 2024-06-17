package com.coherentsolutions.java.webauto.section03.advanced.ex5;

import java.util.Objects;

/**
 * Demonstrates the equals() method.
 */
public class Ex05EqualsMethod {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);
        Developer developer2 = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);

        System.out.println("Developer 1 equals Developer 2: " + developer1.equals(developer2));
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return age == developer.age && Double.compare(developer.salary, salary) == 0 && Objects.equals(name, developer.name) && Objects.equals(lastName, developer.lastName) && position == developer.position && type == developer.type;
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
