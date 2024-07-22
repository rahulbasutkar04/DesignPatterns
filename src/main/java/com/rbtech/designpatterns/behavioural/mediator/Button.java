package com.rbtech.designpatterns.behavioural.mediator;

public class Button extends UIControl{
    private boolean iaEnabled;

    public boolean isIaEnabled() {
        return iaEnabled;
    }

    public void setIaEnabled(boolean iaEnabled) {
        this.iaEnabled = iaEnabled; notifyEvenHandler();
    }
}






