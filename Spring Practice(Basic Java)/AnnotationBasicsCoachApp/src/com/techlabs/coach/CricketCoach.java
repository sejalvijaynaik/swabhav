package com.techlabs.coach;

import org.springframework.stereotype.Component;

import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

@Component
public class CricketCoach implements ICoachable {

	@Override
	public String getDailyWorkout() {
		return "Do 30 mins bowling daily";
	}

	@Override
	public String getDailyFortune() {
		return "Good luck";
	}

}
