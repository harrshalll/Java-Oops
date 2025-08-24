package com.harshal.access;

import java.util.Objects;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }
    //we will go in detailed when I am going through hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();// when we return num or Objects,hash(num) instead of super.hashcode() it return the num passed in constructor
        // and for second it generates random number
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);
        ObjectDemo obj3 = obj;
        System.out.println(obj.hashCode() + " " + obj2.hashCode() + " " + obj3.hashCode());
        //Hashcode is unique random number computed by internal algorithm. same object can have same hashcode number like
        // obj3 have same as obj.
        System.out.println(obj == obj3);
        System.out.println(obj.equals(obj2));
        System.out.println(obj instanceof ObjectDemo);

    }
}
/*
1. By default, hashCode() and equals() deal with references.
If you override them, you can make them deal with content instead.
2. instanceof checks whether obj of class is the used class or not
3. getClass() give the class of the object
 */
