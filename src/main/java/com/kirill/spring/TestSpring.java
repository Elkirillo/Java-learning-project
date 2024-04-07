package com.kirill.spring;

import com.kirill.spring.music.impl.ClassicMusic;
import com.kirill.spring.music.impl.MusicPlayer;
import com.kirill.spring.music.impl.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ClassicMusic testBean = context.getBean("musicBean", ClassicMusic.class);
        //MusicPlayer mp3 = new MusicPlayer(testBean);
        //mp3.playMusic();
        MusicPlayer mp3 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer mp4 = context.getBean("musicPlayer", MusicPlayer.class);
        mp4.setVolume(14);
        mp4.setName("Britney Spears");
        mp3.playMusic();
        System.out.println(mp3.getName() + " " + mp3.getVolume());
        System.out.println(mp4.getName() + " " + mp4.getVolume());

        context.close();
    }
}
