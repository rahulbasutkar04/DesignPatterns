package com.rbtech.designpatterns.behavioural.state1;

public class Context {
    private Package state = new OrderState();//

    public void setState(Package state) {
        this.state = state;
    }

    public Package getState() {
        return state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
