package com.rbtech.designpatterns.structural.bridge;

// Concrete Implementor
class MP4Format implements MediaFormat {
    @Override
    public void play(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}