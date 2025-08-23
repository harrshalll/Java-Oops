package com.harshal.access;

public class A {
    private int num;
    public String name;
    int[] arr;
    protected int n1;


    public A(int num, String name, int n1) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
        this.n1 = n1;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
