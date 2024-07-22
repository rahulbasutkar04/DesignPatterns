package com.rbtech.designpatterns.behavioural.template;

public class Main {
    public static void main(String[] args) {
        BeverageMaker teamaker=new TeaMaker();
        teamaker.makeBeverage();

        BeverageMaker makeCofee=new CoffeeMaker();
        makeCofee.makeBeverage();
    }
}
