package com.rbtech.designpatterns.behavioural.observer2;

public class User3 implements Observer{
    @Override
    public void update(String message) {
        System.out.println("User 3"+message);
    }
}
