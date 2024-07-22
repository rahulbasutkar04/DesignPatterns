package com.rbtech.designpatterns.structural.adapter;

class MediaPlayerAdapter implements NewMediaPlayer {
    private oldMediaPlayer oldMediaPlayer;

    MediaPlayerAdapter(com.rbtech.designpatterns.structural.adapter.oldMediaPlayer oldMediaPlayer) {
        this.oldMediaPlayer = oldMediaPlayer;
    }

    @Override
    public void playNewMedial(String fileName) {
        oldMediaPlayer.playOldMedial(fileName);
      }
}
