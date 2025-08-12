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
        //parent class has no idea about weight field of child class so you cannot initialized weight in obj of type Box class
//        BoxWeight box6 = new Box(2,5,6);
//        System.out.println(box6.weight);


    }
}
/*
Note:-
1. parent class cannot access the objects of child class but child class can access the members of parent class through
   inheritance until and unless member is private.
 */