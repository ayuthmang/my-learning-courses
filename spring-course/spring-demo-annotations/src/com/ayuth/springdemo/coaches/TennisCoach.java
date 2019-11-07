package com.ayuth.springdemo.coaches;

import com.ayuth.springdemo.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("TENNISCOACH")
@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private /* @Qualifier("randomFortuneService") */ FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }*/
}
