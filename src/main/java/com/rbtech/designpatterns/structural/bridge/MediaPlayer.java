package com.rbtech.designpatterns.structural.bridge;

// Abstraction
abstract class MediaPlayer {
    protected MediaFormat format;

    protected MediaPlayer(MediaFormat format) {
        this.format = format;
    }

    abstract void playFile(String filename);
}
