package com.rbtech.designpatterns.behavioural.observer;

public class Datasource extends  Subject{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
