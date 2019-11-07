package com.ayuth.springdemo.services;

public class AngryFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Angry angry angry!";
    }
}
