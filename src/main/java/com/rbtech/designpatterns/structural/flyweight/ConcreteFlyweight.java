package com.rbtech.designpatterns.structural.flyweight;

// ConcreteFlyweight class
public class ConcreteFlyweight implements Flyweight {
    private final String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Intrinsic State = " + intrinsicState + ", Extrinsic State = " + extrinsicState);
    }
}
