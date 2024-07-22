package com.rbtech.designpatterns.behavioural.observer;

public class SpreadSheet implements Observer{

    @Override
    public void update() {
        System.out.println("SpreadSheet Got notified");
    }
}
