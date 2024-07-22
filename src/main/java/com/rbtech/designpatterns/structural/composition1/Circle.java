package com.rbtech.designpatterns.structural.composition1;

import java.awt.*;


// it is leaf
public class Circle implements shape {


    @Override
    public void draw(String color) {
        System.out.println("hey i am leaf");
        System.out.println("Drawing one circle:"+color);
    }
}
