package com.rbtech.designpatterns.behavioural.mediator;

public class ListBox extends  UIControl{
    private  String slection;

    public String getSlection() {
        return slection;
    }

    public void setSlection(String slection) {
        this.slection = slection;
        notifyEvenHandler();
    }
}
