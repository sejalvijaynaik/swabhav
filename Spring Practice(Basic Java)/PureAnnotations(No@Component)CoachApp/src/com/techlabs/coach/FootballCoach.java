package com.techlabs.coach;

import org.springframework.beans.factory.annotation.Value;

import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;

public class FootballCoach implements ICoachable {

	private FortuneService fortuneService;

	@Value("${sports.email}")
	private String email;

	@Value("${sports.team}")
	private String team;

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do kicking for 30 mins daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
