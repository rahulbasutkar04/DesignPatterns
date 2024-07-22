package com.rbtech.designpatterns.structural.adapter;

public class OldMediaPlayerImpl implements oldMediaPlayer{
    @Override
    public void playOldMedial(String fileName) {
        System.out.println("playing old media"+fileName);
    }
}
