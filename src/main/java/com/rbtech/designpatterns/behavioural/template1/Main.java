package com.rbtech.designpatterns.behavioural.template1;

public class Main {
    public static void main(String[] args) {
        HouseTemplate houseTemplate=new GlassHouse();
        houseTemplate.buildHouse();
    }
}
