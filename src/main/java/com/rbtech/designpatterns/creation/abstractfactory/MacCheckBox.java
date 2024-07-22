package com.rbtech.designpatterns.creation.abstractfactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Pressing checkbox from macBook");
    }
}
