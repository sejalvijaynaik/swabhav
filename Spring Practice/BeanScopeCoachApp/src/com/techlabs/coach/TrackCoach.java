package com.techlabs.coach;

import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

public class TrackCoach implements ICoachable {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 30 mins of runnung";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
