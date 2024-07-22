package com.rbtech.designpatterns.behavioural.template;

public class TeaMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("stepping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
