package com.harshal.principles.polymorphism;//poly--->Many , Morphism--->ways to represent

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Shapes circle1 = new Circle();//Upcasting

        square.area();
        circle.area();
        circle1.area();
        // Superclass obj = new Subclass();
        //  This is called Upcasting.
        //  Reference type (Superclass) decides what members are accessible.
        //so, at compile time compiler checks is area() present in Shapes. If yes then move to Object type override the
        // method if there is area method present in circle
        //  Actual method executed is based on object type (Subclass) at runtime.
        //  This is an example of Runtime Polymorphism (Dynamic Method Dispatch is mechanism to call overridden method).



        Shapes.greeting();//this is static method so, we didn't need object of Shapes class to access this method

        circle1.greeting();//you cannot override statics method

    }
}
/*
1.  same entity (method or operator or object) can perform different operations in different scenarios.

2.  Types Of Polymorphism--->
a. Compile Time / Static Polymorphism ---> achieved via method overloading(Same Name of methods but different task execution)
b. Run Time / Dynamic polymorphism ---> achieved via method overriding.

3. As we know ref variable of object decides the property of a created object but override annotation will override the
// method according to it.


4. if we declare superclass method as final it cannot be overridden.
   so, final methods can't override.

5.  if we declare class as final then, it implicitly declare all field of that class as final

 */
