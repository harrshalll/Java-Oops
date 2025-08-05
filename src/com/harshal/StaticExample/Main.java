package com.harshal.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Harshal = new Human(23,"Harshal Avhad",1000000,false);
        Human Kunal = new Human(25,"Kunal Kushwaha",2000000,true );

        System.out.println(Kunal.population);
        System.out.println(Harshal.population);
    }
}
