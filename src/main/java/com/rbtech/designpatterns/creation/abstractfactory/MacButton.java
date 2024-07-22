package com.rbtech.designpatterns.creation.abstractfactory;

public class MacButton implements Button{
    @Override
    public void press() {
        System.out.println("pressing button in MacBook");
    }
}
