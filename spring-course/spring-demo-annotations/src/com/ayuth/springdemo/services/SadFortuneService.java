package com.ayuth.springdemo.services;

import com.ayuth.springdemo.services.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
