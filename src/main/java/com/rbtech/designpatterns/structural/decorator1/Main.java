package com.rbtech.designpatterns.structural.decorator1;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new FarmHousePizza();

        System.out.println(pizza.cost());

        pizza=new ExtraCheese(new MargheritaPizza());

        System.out.println(pizza.cost());

        pizza=new ExtraCheese(new MushRoom(new MargheritaPizza()));

        System.out.println(pizza.cost());


    }
}
