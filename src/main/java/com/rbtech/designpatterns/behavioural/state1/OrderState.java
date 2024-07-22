package com.rbtech.designpatterns.behavioural.state1;

public class OrderState implements Package {
    @Override
    public void next(Context context) {
        context.setState(new DeliveredState());
    }

    @Override
    public void prev(Context context) {
        System.out.println("There is no previous state as it is the root.");
    }

    @Override
    public void printStatus() {
        System.out.println("Currently in OrderState.");
    }
}
