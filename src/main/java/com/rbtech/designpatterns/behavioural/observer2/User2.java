package com.rbtech.designpatterns.behavioural.observer2;

public class User2 implements Observer{
    @Override
    public void update(String message) {
        System.out.println("User 2"+message);
    }
}
