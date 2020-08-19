package com.techlabs.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

@Component
public class FootballCoach implements ICoachable {

	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Do kicking for 30 mins daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
