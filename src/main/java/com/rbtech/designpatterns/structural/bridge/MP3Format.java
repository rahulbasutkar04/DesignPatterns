package com.rbtech.designpatterns.structural.bridge;

// Concrete Implementor
class MP3Format implements MediaFormat {
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 file: " + filename);
    }
}