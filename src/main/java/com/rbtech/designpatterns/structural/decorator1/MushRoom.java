package com.rbtech.designpatterns.structural.decorator1;

public class MushRoom extends ToppingOperator{
    BasePizza basePizza;

    public MushRoom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+100;
    }
}
