package com.techlabs.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.techlabs.coachable.ICoachable;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoachable tennisCoach = context.getBean("myCoach", ICoachable.class);
		ICoachable cricketCoach = context.getBean("cricketCoach", ICoachable.class);

		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyWorkout());
		
		context.close();
	}

}
