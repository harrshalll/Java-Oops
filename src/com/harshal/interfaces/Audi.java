package com.harshal.interfaces;

public class Audi {
    private Engine engine;
    private Media musicplayer = new CDPlayer();

    public Audi() {
       engine = new PowerEngine();
    }

    public Audi(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startsMusic(){
        musicplayer.start();
    }

    public void stopsMusic(){
        musicplayer.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
