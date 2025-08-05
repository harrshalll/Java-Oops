package com.harshal.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;// static keyword in class is used to declare the property which is same for all objects.

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;//to access the static variable className.variable is required.
    }
}