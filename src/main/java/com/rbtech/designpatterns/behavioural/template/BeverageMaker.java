package com.rbtech.designpatterns.behavioural.template;

public abstract class BeverageMaker {

    public  final void makeBeverage()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract  void brew();
    abstract  void addCondiments();

    public void boilWater()
    {
        System.out.println("Boiling Water");
    }

    public  void pourInCup()
    {
        System.out.println("Pouring into  cup");
    }
}
