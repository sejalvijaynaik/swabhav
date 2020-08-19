package com.techlabs.coach;

import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

public class BaseballCoach implements ICoachable {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 30 mins of batting";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
}
