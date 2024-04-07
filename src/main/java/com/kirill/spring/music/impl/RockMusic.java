package com.kirill.spring.music.impl;

import com.kirill.spring.music.Music;

public class RockMusic implements Music {
    @Override
    public void playMusic() {
        System.out.println("Rock music plays");
    }
}
