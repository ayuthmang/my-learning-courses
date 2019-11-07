package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
        CricketCoach alphaCoach = context.getBean("myCoach", CricketCoach.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // print out the results
        System.out.println("\nPoint to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}