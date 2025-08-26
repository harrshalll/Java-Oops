package com.harshal.interfaces;

public interface Engine {

    int PRICE = 780000;
    void start();
    void stop();
    void accelerate();
}
/*
1. Multiple Inheritance is done by  interfaces in java.(Also called diamond Problem)

2. We can't create Objects of interfaces.

3. All variables are static and final  by default in interfaces unlike abstract classes.
   Why are they final?--> because interfaces can't have constructor. so, you can't initialize variable inside constructor
   hence, they are final. As we know, final variable has to initialize where they declared.

4.  Interface can implement more than one interfaces but class/ abstract class extends/inherit only on class.
    But class can implement more than one interfaces.

5. Members of interface are public by default, unless they are default or static in Java 8+
 */