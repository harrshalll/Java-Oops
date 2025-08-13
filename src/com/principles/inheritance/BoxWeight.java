package com.principles.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w);// what is this?--> call the parent class constructor
        // used to initialize values present in parent class.
        this.weight = weight;
        // In subclass/ child class you have to call the parent class constructor first by super(parameters);
        //super(h, l, w); is not allowed, because compiler will see from top to bottom while compiling.
    }
}
