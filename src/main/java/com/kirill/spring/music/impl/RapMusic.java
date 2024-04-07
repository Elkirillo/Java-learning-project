package com.kirill.spring.music.impl;

import com.kirill.spring.music.Music;

public class RapMusic implements Music {
    @Override
    public void playMusic() {
        System.out.println("Rap music plays");
    }
}
