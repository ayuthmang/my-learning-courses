package com.ayuth.springdemo.coaches;

import com.ayuth.springdemo.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Autowired
//    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//    @Value("${swimcoach.fortune}")
//    private String fortune;

    @Value("${swimcoach.email}")
    private String email;

    @Value("${swimcoach.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
