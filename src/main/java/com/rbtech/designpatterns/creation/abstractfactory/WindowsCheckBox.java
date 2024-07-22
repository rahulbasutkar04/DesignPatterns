package com.rbtech.designpatterns.creation.abstractfactory;

public class WindowsCheckBox implements Button, CheckBox {
    @Override
    public void press() {
        System.out.println("Pressing the checkBox in Windows");
    }

    @Override
    public void check() {
        System.out.println("Checking box From Windows");
    }
}
