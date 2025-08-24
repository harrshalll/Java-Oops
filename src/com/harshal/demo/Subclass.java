package com.harshal.demo;

import com.harshal.access.A;

public class Subclass extends A {
    public Subclass(int num, String name, int n1) {
        super(num, name, n1);
    }

    public static void main(String[] args) {
        Subclass obj2 = new Subclass(2,"Protected",56);
        int q = obj2.n1;

    }
}
