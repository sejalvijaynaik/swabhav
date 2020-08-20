package com.techlabs.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.techlabs.coachable.ICoachable;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoachable trackCoach = context.getBean("trackCoach", ICoachable.class);
		ICoachable cricketCoach = context.getBean("cricketCoach", ICoachable.class);
		ICoachable footballCoach = context.getBean("footballCoach", ICoachable.class);

		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());

		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());

		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getDailyFortune());

		context.close();
	}

}
