package com.ayuth.springdemo.coaches;

import com.ayuth.springdemo.services.FortuneService;

public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    public GolfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice practice and practice.";
    }

    @Override
    public String getDailyFortune() {
        return "Achievements on the golf course are not what matters, decency and honesty are what matter.";
    }
}
