package com.spring.study;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {

    private List<String> songs = Arrays.asList("Wind cries Mary", "Can't Stop", "Holiday");

    public List<String> getSongs() {
        return songs;
    }
}
