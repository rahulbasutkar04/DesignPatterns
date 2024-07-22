package com.rbtech.designpatterns.behavioural.Commnad;

public class DecreaseIntensity implements Command {
    Light light;
    public DecreaseIntensity(Light light) {
        this.light=light;
    }

    @Override
    public void execute() {
        System.out.println("Decreased the intensity Of Light");
    }
}
