package com.rbtech.designpatterns.structural.bridge;

// Refined Abstraction
class VideoPlayer extends MediaPlayer {
    public VideoPlayer(MediaFormat format) {
        super(format);
    }

    @Override
    void playFile(String filename) {
        System.out.print("Video Player: ");
        format.play(filename);
    }
}