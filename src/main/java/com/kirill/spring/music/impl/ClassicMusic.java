package com.kirill.spring.music.impl;

import com.kirill.spring.music.Music;

public class ClassicMusic implements Music {

    private ClassicMusic () {}

    public static ClassicMusic getClassicalMusic() {
        return new ClassicMusic();
    }
    @Override
    public void playMusic() {
        System.out.println("Classic music plays");
    }
}
