package com.rbtech.designpatterns.behavioural.observer2;

public class User1 implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Hello User 1"+message);
    }
}
