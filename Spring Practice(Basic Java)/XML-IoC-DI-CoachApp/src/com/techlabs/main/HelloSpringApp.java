package com.techlabs.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.coach.FootballCoach;
import com.techlabs.coach.TennisCoach;

public class HelloSpringApp {

	public static void main(String[] args) {

		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICoachable coach = context.getBean("myTennisCoach", ICoachable.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();*/
		
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TennisCoach coach = context.getBean("myTennisCoach", TennisCoach.class);
		
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		FootballCoach coach = context.getBean("myFooltballCoach", FootballCoach.class);
		
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
