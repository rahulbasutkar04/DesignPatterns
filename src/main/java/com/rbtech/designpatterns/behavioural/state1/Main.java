package com.rbtech.designpatterns.behavioural.state1;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.previousState();
        context.printStatus();

        context.nextState();

        context.nextState();
        context.printStatus();

        context.previousState();
        context.printStatus();
    }
}
