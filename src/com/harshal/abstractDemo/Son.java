package com.harshal.abstractDemo;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("I will be " + name);
    }

    @Override
    void partner(String nme, int age) {
        System.out.println("her name is " + nme + " and She is " + age + " years old.");

    }
}
