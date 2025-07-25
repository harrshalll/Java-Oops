package com.harshal.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        swap(a,b);


        //wrapper class
        Integer num = 200;// or Integer num = new Integer(200);

        //final keyword prevent the modification. final variable always have to initialize while declare it otherwise
        // it will give an error.
        final int m = 10;


        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it but you can change the value like above do.
//        kunal = new A("new object");

        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }

        //      i = 25; we can't change/mutate(applicable only to primitive data types) the variable after using "final" keyword.
        // you should always initialize variable while you are declaring it
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
/*
Notes:-
Wrapper classes are used when:---->You need to store primitives in collections which only accept objects.

 */