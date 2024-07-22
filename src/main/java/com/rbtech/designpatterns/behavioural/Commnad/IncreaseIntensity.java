package com.rbtech.designpatterns.behavioural.Commnad;

public class IncreaseIntensity implements Command {
    Light light;
    public IncreaseIntensity(Light light) {
        this.light=light;

    }

    @Override
    public void execute() {
        System.out.println("Increased Intensity of Light");
    }
}
