package com.rbtech.designpatterns.structural.bridge;

// Refined Abstraction
class AudioPlayer extends MediaPlayer {
    public AudioPlayer(MediaFormat format) {
        super(format);
    }

    @Override
    void playFile(String filename) {
        System.out.print("Audio Player: ");
        format.play(filename);
    }
}