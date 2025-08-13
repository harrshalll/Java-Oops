package com.principles.inheritance;


public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(5,5,5);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
          BoxWeight box3 = new BoxWeight();
          BoxWeight box4 = new BoxWeight(1,2,3,4);
          System.out.println(box3.h + " " + box3.weight);
          System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);
//        Box box6 = new BoxWeight(2,5,6,8);
//        System.out.println(box6.weight);
        //It is reference type of object which determines which members can access not the object type created.From above
        //box6.weight cannot accessible even if we created object of BoxWeight because reference type of object box6 is of Box
        // and Box doesn't have any field like weight.




        // there are many variables in both parent and child classes.
        //you are given access to variable that are in the ref type i.e. BoxWeight
        //hence you should have access to weight variable
        //this is also means that the ones you are trying to access should be initialized
        // but here, when obj itself is of type parent class, how will you call the constructor who can access the weight field.
        //in short, when constructor of Box is being called when you create an object and Box constructor has three parameters only.
        //parent class has no idea about weight field of child class so you cannot initialized weight in obj of type Box class
//        BoxWeight box5 = new Box(2,5,6);
//        System.out.println(box5.weight);

        BoxPrice box =  new BoxPrice(5,25,100);// shows the single inheritance where it inherits the attributes of all superclass above it



        //Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more
        // than one parent class.In short when subclass has more than one parent class
        //Multiple Inheritance is not allowed in java because if two superclass has same attribute and, we create the object of
        //subclass when we try to access that attribute, compiler gets confuse which attribute to choose (ambiguity).
        //Will do in Interfaces

    }
}
/*
Note:-
1. parent class cannot access the members and methods of child class but child class can access the members of parent class through
   inheritance until and unless member is private.


2. parent class is also known as superclass and child class also known as subclass


3. super keyword is to access the attributes of superclass.


4. If you have two weight attributes i.e. one in superclass and another in child class ,and you want to access the weight
   attribute from superclass(field hiding) by super.weight, super keyword is used there. Note 3&4 is use case of super keyword


5. The 'super' keyword is used to:
   - Access members (fields or methods) of the superclass.
   - Call the superclass constructor from the subclass constructor.

6. In hierarchical inheritance, more than one subclass is inherited from a single base class. i.e. more than one derived
   class is created from a single base class

7.  Hybrid Inheritance---> Combination of single and multiple Inheritance and not allowed in java like Multiple Inheritance
    can achieve it by interfaces
 */