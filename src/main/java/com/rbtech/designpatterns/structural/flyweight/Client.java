package com.rbtech.designpatterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        final String state="State1";
        Flyweight flyweight1 = factory.getFlyweight(state);
        flyweight1.operation("context1");

        Flyweight flyweight2 = factory.getFlyweight(state);
        flyweight2.operation("context2");

        Flyweight flyweight3 = factory.getFlyweight(state);
        flyweight3.operation("context3");
    }
}
