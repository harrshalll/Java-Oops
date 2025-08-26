package com.harshal.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(1);
        son.career("doctor");
        son.partner("Wanda" , 24);
        son.normal();
        son.hello();

        System.out.println("\n");
        Daughter daughter = new Daughter(2);
        daughter.career("engineer");
        daughter.partner("Tony Stark", 35);
        daughter.normal();


        Parent.hello();

        //Parent mom = new Parent(5);you can't create object of abstract class. so you will think constructor of parent
        // will be never call but constructor of parent class is always call by super() keyword when object of subclass created

    }
}
/*
1. Abstract Methods -->when you want to enforce the subclasses to implement certain method we have to do it by abstract methods
                        Abstracts methods in Abstract superclass doesn't have body.Must be implemented in concrete (non-abstract) subclasses.
2. Abstract Class --> Class which contains abstract methods is called abstract class.
                        You can't create object of abstract class.
                        Abstract class can also contain normal methods(Concrete methods)

3. Confusion regarding Method Overriding and Abstract keyword -->
    so when you want every subclass have to implement certain method to happen that you have to implement abstract class which
    has abstract method. If you extend abstract superclass to any subclass and subclass doesn't have that method then compiler
    will not compile that code. But in method overriding if superclass has one method and subclass doesn't have this method overridden ,
    compiler will compile and give the output without giving error.

4. we can't create abstract static method because static methods can't be overridden. but we can create simple static method
   inside abstract class.


 */