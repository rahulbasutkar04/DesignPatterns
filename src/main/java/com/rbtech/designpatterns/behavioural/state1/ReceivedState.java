package com.rbtech.designpatterns.behavioural.state1;

public class ReceivedState implements Package {
    @Override
    public void next(Context context) {
        System.out.println("There is no next state as it is the last state.");
    }

    @Override
    public void prev(Context context) {
        context.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Currently in Received State.");
    }
}
