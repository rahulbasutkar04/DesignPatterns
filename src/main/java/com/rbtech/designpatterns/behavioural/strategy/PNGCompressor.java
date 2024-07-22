package com.rbtech.designpatterns.behavioural.strategy;

public class PNGCompressor implements Compressor{
    @Override
    public void Compress(String FileName) {
        System.out.println("Compressing Using PNG ");
    }
}
