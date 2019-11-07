package com.ayuth.springdemo.practice;

import com.ayuth.springdemo.coaches.Coach;
import com.ayuth.springdemo.services.HappyFortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HappyFortuneService happyFortuneService = new HappyFortuneService();
        System.out.println(happyFortuneService.getFortune());

        Coach theCoach = context.getBean("tableTennisCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        Coach theSwimCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(theSwimCoach.getDailyFortune());

        context.close();
    }
}
