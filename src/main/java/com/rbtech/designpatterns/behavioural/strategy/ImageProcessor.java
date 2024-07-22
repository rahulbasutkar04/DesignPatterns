package com.rbtech.designpatterns.behavioural.strategy;

public class ImageProcessor {


    public  void store(String fileName,Compressor compressor,Filter filter)
    {
         compressor.Compress(fileName);
         filter.apply(fileName);
    }
}
