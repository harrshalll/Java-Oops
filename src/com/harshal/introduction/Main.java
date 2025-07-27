package com.harshal.introduction;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //store 5 roll numbers
        int[] roll_numbers = new int[5];

        //store 5 names
          String[] names = new String[5];
          

//        store data of 5 students
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];


        // creating new object from class student
        student harshal;// declaring ref variable of object which will create/instantiate in next step
        harshal = new student();//The (.) (dot) operator is used to access members of a class through an object.
        harshal.rno = 54;// new keyword---> used to dynamically allocates memory and returns a ref.variable to it
        harshal.name = "Harshal Avhad";// instance variable---> variable inside class.
        harshal.marks = 8.41f;
        System.out.println(harshal.rno);
        System.out.println(harshal.name);
        System.out.println(harshal.marks);

        harshal.changeName("Car Lover");
        harshal.greeting();

        //creating new objects in an array from class student
        student[] students = new student[5];


        student kunal = new student();//constructor defines what happens when object is created
        System.out.println(kunal.rno);// o/p is 0 because int didn't initialize
        System.out.println(kunal.name);//o/p is null because String didn't initialize
        System.out.println(kunal.marks);
        kunal.greeting();



        student student3 = new student(2, "Shashank");//declaring and instantiate at same step.
        System.out.println(student3.name);
        System.out.println(student3.marks);
        System.out.println(student3.rno);


//        following thing is for calling the constructor from another constructor
//        student random = new student();
//        System.out.println(random.name);


        //Human class
//        Human Harshal = new Human();
//        Harshal.legs = 2;
//        Harshal.eyes = 2;
//        Harshal.hands = 2;
//        Harshal.nose = 1;
//        System.out.println(Harshal.legs);
    }
}
//create a class---> class is a named group of properties and methods.
class student {
    int rno ;
    String name;
    float marks;

    //no-Argument Constructor
    student(){
        this.rno = 50;
        this.name = "kunal";
        this.marks = 8.5f;
    }

    //Parameterized Constructor
    student(int rollno, String studentname){
        this.rno = rollno;//| rno |--->this variable which passed inside parameterized constructor should not have same name
        this.name = studentname;//as variable declare inside class if you are not using "this" keyword
    }


//    this is how you call the constructor from another constructor
//    student(){
//        this (1,"default person");
//    }


    void greeting()  {
        System.out.println("Hello! My name is " +this.name);
    }

    void changeName(String NewName){
        this.name = NewName;

    }
}

/*
1. here we create a class which has three properties rno, names and marks.
2. If you want to create your own data type then it is done by creating new class.
3. class is a template of object.
4. An object is an instance created from the class template, containing actual data.
5. class ---> logical construct (does not present in reality)
6. object ---> physical reality (This is something which occupies space in memory.)
7. Properties of an Objects.
 Term           Meaning
 State--->      The data/properties (fields/variables) of the object
 Identity-->    The unique reference/address that differentiates one object from another
 Behavior-->    The actions the object can perform (methods/functions)
8.Constructor are special type of function in class that runs when you create an object, and it allocates some variables
9.Before using constructor student(){} inside the class, student2 was showing default values like 0, null, etc.
 But once I added the constructor, it started assigning custom values to student2.
10.constructor does not have any return type its return type is class's return type
11.By-default Constructor ---> present default in class and does not have arguments,it allocates o and null to object variables.
12."this" ----> This keyword is used to refer the current object from the constructor.
13.Dynamic allocation : memory allocates at run time.
14.Constructor Overloading in Java means creating multiple constructors in the same class with different parameter lists
 (number, type, or order of parameters).

*/
