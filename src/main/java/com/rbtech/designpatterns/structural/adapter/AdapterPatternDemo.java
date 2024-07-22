package com.rbtech.designpatterns.structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        oldMediaPlayer oldPlayer = new OldMediaPlayerImpl();
        NewMediaPlayer adapter = new MediaPlayerAdapter(oldPlayer);
        adapter.playNewMedial("song.mp3");
    }
}
