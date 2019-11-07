package com.company;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CricketCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    public CricketCoach() {
    }

    // define a constructor for dependency injection
    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run for 2 hours";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private void init() {
        System.out.println("init");
    }

    private void myDestroy() {
        System.out.println("destroy");
    }
}
