package com.techlabs.fortune.services;

import org.springframework.stereotype.Component;
import com.techlabs.fortune.service.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Good luck";
	}

}
