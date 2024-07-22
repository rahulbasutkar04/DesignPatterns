package com.rbtech.designpatterns.behavioural.state1;

public class DeliveredState implements Package {
    @Override
    public void next(Context context) {
        context.setState(new ReceivedState());
    }

    @Override
    public void prev(Context context) {
        context.setState(new OrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("Currently in Delivered State.");
    }
}
