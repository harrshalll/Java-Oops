package com.harshal.introduction;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //store 5 roll numbers
        int roll_numbers[] = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        // creating new object from class student
        student student1 = new student();//The (.) (dot) operator is used to access members of a class through an object.
        student1.rno = 54;// new keyword---> used to dynamically allocates memory and returns a ref.variable to it
        student1.name = "Harshal";
        student1.marks = 8.41f;
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        //creating new objects in an array
        student[] students = new student[5];
        student student2 = new student();
        System.out.println(student2.rno);// o/p is 0 because int didn't initialize
        System.out.println(student2.name);//o/p is null because String didn't initialize
        System.out.println(student2.marks);

        student student3 = new student();



        //Human class
        Human Harshal = new Human();
        Harshal.legs = 2;
        Harshal.eyes = 2;
        Harshal.hands = 2;
        Harshal.nose = 1;
    }
}
//create a class---> class is a named group of properties and methods.
class student {
    int rno ;
    String name;
    float marks;
    student(){
        this.rno = 13;
        this.name = "Ram";
        this.marks = 99.55f;
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
8.Constructor are special type of function
9.Before using constructor student(){} inside the class, student2 was showing default values like 0, null, etc.
 But once I added the constructor, it started assigning custom values to student2.
*/
