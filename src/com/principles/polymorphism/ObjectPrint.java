package com.principles.polymorphism;

public class ObjectPrint {//it extends default Object class
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
        //there isn't any method to print the obj but default Object class has default toString method which is called when
        // there isn't any method to run
    }
}
