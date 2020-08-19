package com.techlabs.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.techlabs.coachable.ICoachable;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICoachable firstCoach = context.getBean("myCoach", ICoachable.class);

		context.close();
	}

}
