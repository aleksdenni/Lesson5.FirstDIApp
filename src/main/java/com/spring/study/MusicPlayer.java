package com.spring.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

import static com.spring.study.Genre.*;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {

    @Value("${name}")
    private String name;
    @Value("${volume}")
    private int volume;


    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playRandomMusic(List<Genre>allGenres) {
        Genre genre = allGenres.get(new Random().nextInt(allGenres.size()));
        Music music=null;
        if (genre==ROCK){
            music = new RockMusic();
        }else if (genre==POP){
            music = new PopMusic();
        }else if (genre==CLASSICAL){
            music = new ClassicalMusic();
        }
        return "Playing: " + music.getSongs().get(new Random().nextInt(music.getSongs().size()));
    }

}
