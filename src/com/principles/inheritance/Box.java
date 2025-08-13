package com.principles.inheritance;

public class Box {
    double l;
    double h;
    double w;

     Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side) {

         super();//Call the superclass constructor from the subclass constructor.


        this.l = side;
        this.h = side;
        this.w = side;
    }


    Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box (Box old){
         this.h = old.h;
         this.w = old.w;
         this.l = old.l;
    }

    public void displayInfo(){
        System.out.println("Running the box");
    }
}
