package com.spring.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic cm1 = context.getBean("classicalMusic", ClassicalMusic.class);

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }
}