package com.rbtech.designpatterns.behavioural.strategy;

public class HighContrast implements Filter {
    @Override
    public void apply(String FileName) {
        System.out.println("Applying High Contrast..");
    }
}
