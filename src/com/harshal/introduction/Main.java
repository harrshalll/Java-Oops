package com.harshal.introduction;

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


        //new object from class student
        student s1;
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
4.  An object is an instance created from the class template, containing actual data.
5. class ---> logical construct (does not present in reality)
6. object ---> physical reality (This is something which occupies space in memory.)

*/
