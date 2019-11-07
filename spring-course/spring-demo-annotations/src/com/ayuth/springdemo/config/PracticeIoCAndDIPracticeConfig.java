package com.ayuth.springdemo.config;

import com.ayuth.springdemo.coaches.Coach;
import com.ayuth.springdemo.coaches.GolfCoach;
import com.ayuth.springdemo.coaches.SwimCoach;
import com.ayuth.springdemo.services.AngryFortuneService;
import com.ayuth.springdemo.services.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeIoCAndDIPracticeConfig {
    @Bean
    public FortuneService angryFortuneService() {
        return new AngryFortuneService();
    }

    @Bean
    public Coach golfCoach(FortuneService fortuneService) {
        return new GolfCoach(fortuneService);
    }
}
