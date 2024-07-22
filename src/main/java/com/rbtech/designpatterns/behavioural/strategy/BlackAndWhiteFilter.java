package com.rbtech.designpatterns.behavioural.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String FileName) {
        System.out.println("Applying  Black And White Compressor..");
    }
}
