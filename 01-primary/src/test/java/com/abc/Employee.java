package com.abc;

public class Employee extends Person {
    String name;

    public Employee(String name) {
        super(name);
        this.name = name;
    }

    public static void main(String[] args) {
        new Employee("abc");
    }
}
