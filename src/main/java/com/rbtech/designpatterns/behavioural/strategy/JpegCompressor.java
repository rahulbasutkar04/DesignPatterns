package com.rbtech.designpatterns.behavioural.strategy;

public class JpegCompressor implements  Compressor{
    @Override
    public void Compress(String FileName) {
        System.out.println("Compressing image using JPEG");
    }
}
