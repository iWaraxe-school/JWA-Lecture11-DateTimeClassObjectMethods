package com.coherentsolutions.java.webauto.section03;

import java.util.Objects;

/**
 * Demonstrates that all classes in Java inherit from the Object class.
 */
public class Ex01ObjectReference {
    public static void main(String[] args) {
        // Object reference variable pointing to a Developer instance
        Object obj = new Developer("Petya", "Ivanov", 30, Position.DEVELOPER, 3000, DeveloperType.BACK_END);
        //obj.getName();

        // Type casting to Developer to use specific methods
        Developer developer = (Developer) obj;
        developer.getName();
        System.out.println(developer);
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Developer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", position=").append(position);
        sb.append(", salary=").append(salary);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer developer)) return false;

        return Objects.equals(name, developer.name) && Objects.equals(lastName, developer.lastName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(lastName);
        return result;
    }

}

enum Position {
    DEVELOPER, MANAGER
}

enum DeveloperType {
    BACK_END, FRONT_END
}
