package com.spring.study;

import java.util.Arrays;
import java.util.List;

public class PopMusic implements Music {

    List<String> songs = Arrays.asList("song1","song2","song3");

    public void doMyDestroy(){
        System.out.println("Doing ");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
