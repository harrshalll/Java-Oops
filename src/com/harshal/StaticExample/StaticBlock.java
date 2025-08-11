package com.harshal.StaticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once when the first object is create i.e., when the class is loaded
    static{//it is static block
        System.out.println("Here Class is loaded in RAM memory by java classLoader");
        System.out.println("Static Block will run before the main() function");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


        StaticBlock obj2 = new StaticBlock();
      //  System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
