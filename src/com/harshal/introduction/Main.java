package com.harshal.introduction;
import java.util.Arrays;

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

        //creating new objects in an array
        student[] students = new student[5];
        student student2 = new student();

    }
}
//create a class---> class is a named group of properties and methods.
class student {
    int rno ;
    String name;
    float marks;
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

*/
