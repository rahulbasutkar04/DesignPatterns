package com.rbtech.designpatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        ImageProcessor imageProcessor=new ImageProcessor();
        imageProcessor.store("Rahul",new JpegCompressor(),new BlackAndWhiteFilter());
        imageProcessor.store("Rahul",new PNGCompressor(),new HighContrast());

    }
}
