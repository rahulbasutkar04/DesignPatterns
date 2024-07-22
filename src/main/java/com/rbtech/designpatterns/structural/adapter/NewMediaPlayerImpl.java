package com.rbtech.designpatterns.structural.adapter;

public class NewMediaPlayerImpl implements NewMediaPlayer{
    @Override
    public void playNewMedial(String fileName) {
        System.out.println("playing new media "+fileName);
    }
}
