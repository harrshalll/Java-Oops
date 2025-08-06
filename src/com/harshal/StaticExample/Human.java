package com.harshal.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;// static keyword in class is used to declare the property which is same for all objects.static word is used when attribute/property of class is same for all the objects created inside that class 

    static void message(){
        System.out.println("Hello World");
        //System.out.println(this.age);you cannot use this inside static because this keyword belongs to/ refers to an object
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;//To access the static variable className.variable is required.because static variable
                            // can't go with instance variable which is accessible by this keyword
    }
}
/*
Static variable---> When the member declared is static, it can be accessed before any object of that class is being created
                    and without referencing to that objects.
                    you can check by commenting out the object declaration and then try to access the Human.population
 */
