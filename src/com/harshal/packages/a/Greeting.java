package com.harshal.packages.a;

import java.util.ArrayList;

import static com.harshal.packages.b.Message.message;
//To run the message() method which is present inside another package you have to import path directory
//com-->harshal-->packages-->b--->Message(Class)-->message()(method).
//import shortcut --> Alt + Enter on method you want to run.
//Note: You can access only those who are declare as public.

public class Greeting {
    public static void main(String[] args) {
        System.out.println("hello world");

        message();

    }

}
