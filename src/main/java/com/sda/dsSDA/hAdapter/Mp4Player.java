package com.sda.dsSDA.hAdapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}
