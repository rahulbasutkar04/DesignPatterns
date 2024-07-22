package com.rbtech.designpatterns.behavioural.chainOfResponsibility;

public class Compressor extends Handler {


    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressor");
        return false;
    }
}
