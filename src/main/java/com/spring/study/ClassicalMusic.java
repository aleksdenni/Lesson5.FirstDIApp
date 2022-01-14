package com.spring.study;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;


public class ClassicalMusic implements Music {

    List<String> songs = Arrays.asList("classicSong1","classicSong2","classicSong3");

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
