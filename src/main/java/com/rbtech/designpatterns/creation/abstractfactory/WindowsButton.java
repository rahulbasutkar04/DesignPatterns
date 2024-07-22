package com.rbtech.designpatterns.creation.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void press() {
        System.out.println("Pressing Button in Windows");
    }
}
