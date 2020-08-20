package com.techlabs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.coach.FootballCoach;
import com.techlabs.coachable.ICoachable;
import com.techlabs.config.SportsConfig;

public class HelloSpringApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		ICoachable trackCoach = context.getBean("trackCoach", ICoachable.class);
		FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);

		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());

		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getDailyFortune());
		System.out.println(footballCoach.getEmail());
		System.out.println(footballCoach.getTeam());

		context.close();
	}

}
