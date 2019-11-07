package com.ayuth.springdemo.practice;

import com.ayuth.springdemo.coaches.GolfCoach;
import com.ayuth.springdemo.config.PracticeIoCAndDIPracticeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeIoCAndDIWithJavaConfigurationApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeIoCAndDIPracticeConfig.class);

        GolfCoach golfCoach = context.getBean("golfCoach", GolfCoach.class);

        System.out.println(golfCoach.getDailyWorkout());
        System.out.println(golfCoach.getDailyFortune());

        context.close();
    }
}
