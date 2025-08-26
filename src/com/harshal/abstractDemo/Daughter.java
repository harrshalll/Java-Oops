package com.harshal.abstractDemo;

public class Daughter extends Parent{
    @Override
    void career(String name) {
        System.out.println("I will be " + name);
    }

    @Override
    void partner(String nme, int age) {
        System.out.println("I love " + nme + " age is " + age);
    }
}
