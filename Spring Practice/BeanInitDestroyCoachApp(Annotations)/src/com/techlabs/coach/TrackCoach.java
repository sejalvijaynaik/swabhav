package com.techlabs.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

@Component
public class TrackCoach implements ICoachable {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Do 30 mins of runnung";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("track coach is initializing");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("track coach is destroyed");
	}

}
