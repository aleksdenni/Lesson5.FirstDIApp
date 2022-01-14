package com.spring.study;

import java.util.List;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private List<Genre>allGenres;

    public Computer(MusicPlayer musicPlayer,List<Genre> allGenres) {
        this.id=1;
        this.musicPlayer = musicPlayer;
        this.allGenres=allGenres;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", MusicPlayer=" + musicPlayer.playRandomMusic(allGenres) +
                '}';
    }
}
