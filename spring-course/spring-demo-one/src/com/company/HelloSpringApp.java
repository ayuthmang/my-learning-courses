package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.krb5.internal.crypto.Crc32CksumType;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// close the context
		context.close();
	}

}







