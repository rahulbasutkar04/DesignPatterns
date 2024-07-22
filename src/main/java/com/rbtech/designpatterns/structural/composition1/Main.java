package com.rbtech.designpatterns.structural.composition1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw("White");

        Rectangle r = new Rectangle();
        r.draw("Green");

        Composite composite = new Composite();
        composite.addShapes(c);
        composite.addShapes(r);
        composite.addShapes(new Circle());

        composite.draw("Yellow");

    }
}
