package com.techlabs.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

@Component
public class TrackCoach implements ICoachable {

	private FortuneService fortuneService;

	@Autowired
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
