package com.rbtech.designpatterns.structural.composition1;

public class Rectangle implements shape {
    @Override
    public void draw(String color) {
        System.out.println("I am leaf");

        System.out.println("Drawing Reactangle" + color);

    }
}