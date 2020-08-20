package com.techlabs.coach;

import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

public class CricketCoach implements ICoachable {

	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Do 30 mins bowling daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
