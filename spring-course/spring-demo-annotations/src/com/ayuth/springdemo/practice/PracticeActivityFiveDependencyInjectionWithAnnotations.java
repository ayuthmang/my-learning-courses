package com.ayuth.springdemo.practice;

import com.ayuth.springdemo.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivityFiveDependencyInjectionWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theSwimCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(theSwimCoach.getDailyFortune());

        context.close();
    }
}
