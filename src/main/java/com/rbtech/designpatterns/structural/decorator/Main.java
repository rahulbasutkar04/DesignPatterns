package com.rbtech.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee=new PlainCoffee();
        System.out.println("Descrpton of coffe is:"+coffee.getDescription());
        System.out.println("Cost of Coffe:"+coffee.getCost());

        Coffee milkCoffe=new MilkDecorator(new PlainCoffee());

        System.out.println("Description of the coffe:"+milkCoffe.getDescription());
        System.out.println("Cost of the coffee:"+milkCoffe.getCost());

        Coffee sugarMaker=new SugarDecorator(new MilkDecorator(new PlainCoffee()));

        System.out.println("Description OF Coffee:"+sugarMaker.getDescription());
        System.out.println("Cost  of the Coffee"+sugarMaker.getCost());


    }
}
