package com.harshal.interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Music Player starts");
    }

    @Override
    public void stop() {
        System.out.println("Music player Stops");
    }
}
