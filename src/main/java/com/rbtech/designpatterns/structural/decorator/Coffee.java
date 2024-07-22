package com.rbtech.designpatterns.structural.decorator;


//This is the interface Coffee representing the component.
// It declares two methods getDescription() and getCost() which must be implemented by concrete components and decorators.
public interface Coffee {
    String getDescription();
    double getCost();
}
