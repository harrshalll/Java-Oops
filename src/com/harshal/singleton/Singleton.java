package com.harshal.singleton;
//If you want to create just one object any class you have to create singleton class
public class Singleton {
    // If you want to create just one object by basic sense you should not allow to call constructor more than once.
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();

        }

        return instance;
    }


}
