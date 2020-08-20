package com.techlabs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.techlabs.coach.FootballCoach;
import com.techlabs.coach.TrackCoach;
import com.techlabs.coachable.ICoachable;
import com.techlabs.fortune.service.FortuneService;
import com.techlabs.fortune.services.HappyFortuneService;

@Configuration
@ComponentScan("com.techlabs")
@PropertySource("classpath:sports.properties")
public class SportsConfig {

	@Bean
	public FortuneService happyFortuenService() {
		return new HappyFortuneService();
	}

	@Bean
	public ICoachable trackCoach() {
		return new TrackCoach(happyFortuenService());
	}

	@Bean
	public ICoachable footballCoach() {
		return new FootballCoach(happyFortuenService());
	}

}
