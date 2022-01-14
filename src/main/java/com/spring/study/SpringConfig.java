package com.spring.study;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    List<Genre> allGenres(){
        return Arrays.asList(Genre.POP, Genre.ROCK, Genre.CLASSICAL);
    }

    @Bean MusicPlayer musicPlayer(){
        return new MusicPlayer();
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer(), allGenres());
    }
}
