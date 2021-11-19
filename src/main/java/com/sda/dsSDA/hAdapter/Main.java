package com.sda.dsSDA.hAdapter;

public class Main {
    public static void main(String[] args) {

    Audioplayer audioplayer = new Audioplayer();

    audioplayer.play("mp3", "First melody MP3");
    audioplayer.play("mp4", "Second melody MP4");
    audioplayer.play("vlc", "Second melody VLC");
    audioplayer.play("avi", "Second melody AVI");

    }
}
