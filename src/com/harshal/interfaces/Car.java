package com.harshal.interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("I brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start with Button");
    }

    @Override
    public void stop() {
        System.out.println("I stop when breaks are applied");
    }

    @Override
    public void accelerate() {
        System.out.println("I fly when anyone touches accelerator");
    }
}
