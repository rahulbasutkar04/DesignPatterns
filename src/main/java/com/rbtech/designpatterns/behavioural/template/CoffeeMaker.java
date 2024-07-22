package com.rbtech.designpatterns.behavioural.template;

public class CoffeeMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Stepping into Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
