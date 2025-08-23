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
/*
In built packages
1. lang--> contains internal essential things of java mostly syntax of java depends on this package.
2. io--> contains class which helps in file reading, optimize input and out etc.,
3. util--> contains utility classes like data structure, Scanner etc.,
4. applet--> used to create applet.
5. awt--> used for GUI.
6. net--> used for networking application like if anyone wants to connect the created app with networks
 */
