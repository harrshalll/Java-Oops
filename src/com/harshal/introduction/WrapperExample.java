package com.harshal.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;

        Integer num = 200;
        final int m = 10;
        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }

        //      i = 25; we can't change/mutate(applicable only to primitive data types) the variable after using "final" keyword.
        // you should always initialize variable while you are declaring it
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