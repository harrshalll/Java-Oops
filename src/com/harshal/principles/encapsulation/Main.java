package com.harshal.principles.encapsulation;

import com.harshal.access.A;

// Example of Encapsulation
class Student {
    // Private variables (hidden data)
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 5 && age < 100) {  // validation ✅
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter and Setter for grade
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating student object
        Student s1 = new Student("Harsh", 20, "A");

        // Access through getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Grade: " + s1.getGrade());

        // Update values via setters
        s1.setAge(22);  // valid
        s1.setAge(3);   // invalid  -> shows message

        s1.setGrade("A+");

        System.out.println("Updated Age: " + s1.getAge());
        System.out.println("Updated Grade: " + s1.getGrade());

        /*
class Student {
    private String name;
    private int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        //  Not allowed (private)
        // s.name = "Harsh";
        // s.age = 21;

        //  Can only access via methods inside Student class
        s.display(); // prints default values: Name: null, Age: 0
    }
}

         */

        A a = new A(1,"Example",54) ;
        String n = a.name;

    }
}


/*
Encapsulation is encapsulating the data, members and methods in class and can access and manipulate by getters and setters not directly


 */

