package com.harshal.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        int price = Engine.PRICE;
//
//        car.start();
//        car.stop();
//        car.accelerate();
//        //car.brake();
//)
//        Media carMedia = new Car();
//        carMedia.stop();

        Audi R8 = new Audi();

        R8.start();
        R8.upgradeEngine();
        R8.startsMusic();
        R8.stop();
        R8.stopsMusic();
    }
}
