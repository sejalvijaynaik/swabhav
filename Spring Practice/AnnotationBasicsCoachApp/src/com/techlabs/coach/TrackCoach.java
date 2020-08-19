package com.techlabs.coach;

import org.springframework.stereotype.Component;
import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

@Component("myCoach")
public class TrackCoach implements ICoachable {

	@Override
	public String getDailyWorkout() {
		return "Do 30 mins of runnung";
	}

	@Override
	public String getDailyFortune() {

		return "Good luck";
	}

}
