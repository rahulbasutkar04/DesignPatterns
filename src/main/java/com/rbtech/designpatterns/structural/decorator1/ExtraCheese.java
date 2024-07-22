package com.rbtech.designpatterns.structural.decorator1;

public class ExtraCheese extends ToppingOperator{

    BasePizza basePizza;
    ExtraCheese(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
