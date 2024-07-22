package com.rbtech.designpatterns.behavioural.template1;

public class GlassHouse extends HouseTemplate{
    @Override
    void buildWindows() {
        System.out.println("Building and attaching windows of glasses");
    }

    @Override
    void buildWalls() {
        System.out.println("Building an walls of glasses");
    }

}
