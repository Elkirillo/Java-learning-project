package com.kirill.spring.music.impl;

import com.kirill.spring.music.Music;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int volume;

    private List<Music> musics = new ArrayList<>();

    public MusicPlayer() {
       //this.musics = musics;
    }

    public void doMyInit () {
        System.out.println("Init method was called");
    }

    public void doMyDestroy () {
        System.out.println("Destroy method was called");
    }

    public void setMusic(List<Music> musics) {
        this.musics = musics;
    }


    public void playMusic() {
        for (Music music: musics) {
            music.playMusic();
        }
    }
}
