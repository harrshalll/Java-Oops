package com.harshal.principles.polymorphism;

public class Circle extends Shapes{

    // this will run when obj of circle is created
    // hence it is overriding the parent method
   //  @Override//this is called annotation
    void area(){
        System.out.println("Area of Circle is pie * r * r");
    }
    //@Override// we can't override the static method
     static void greeting(){
        System.out.println("Hey!, I am in Circle class");
    }
}
// As we know ref variable of object decides the property of a created object but override annotation will override the
// method according to it