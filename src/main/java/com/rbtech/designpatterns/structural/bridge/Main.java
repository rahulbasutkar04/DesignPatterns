package com.rbtech.designpatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        MediaFormat mp3Format = new MP3Format();
        MediaFormat mp4Format = new MP4Format();

        MediaPlayer audioPlayer = new AudioPlayer(mp3Format);
        MediaPlayer videoPlayer = new VideoPlayer(mp4Format);

        audioPlayer.playFile("song.mp3");
        videoPlayer.playFile("movie.mp4");
    }
}
