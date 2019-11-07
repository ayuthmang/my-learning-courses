package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
        CricketCoach theCoachz = context.getBean("myCoach", CricketCoach.class);
        context.close();
    }
}
