package com.ayuth.springdemo.config;

import com.ayuth.springdemo.coaches.Coach;
import com.ayuth.springdemo.coaches.SwimCoach;
import com.ayuth.springdemo.services.FortuneService;
import com.ayuth.springdemo.services.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.ayuth.springdemo")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
