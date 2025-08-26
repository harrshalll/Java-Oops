package com.harshal.abstractDemo;

public abstract class Parent {
    abstract void career(String name);
    abstract void partner(String nme, int age);

    int num;

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is normal method");
    }

    public Parent(int num) {
        this.num = num;
    }
}
