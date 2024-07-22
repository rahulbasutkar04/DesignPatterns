package com.rbtech.designpatterns.behavioural.state;

public class Eraser implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser Tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }
}
