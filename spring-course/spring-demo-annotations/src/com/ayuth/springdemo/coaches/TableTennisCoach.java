package com.ayuth.springdemo.coaches;

import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice backhand!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
