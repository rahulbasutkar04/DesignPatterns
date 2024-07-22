package com.rbtech.designpatterns.structural.composite;

import com.rbtech.designpatterns.structural.composite.Component;

public class Leaf implements Component {

    String name;
    double price;

    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(this.price);
    }

    @Override
    public void showName() {
        System.out.println(this.name);
    }
}
