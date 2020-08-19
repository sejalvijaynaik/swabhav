package com.techlabs.fortune.services;

import com.techlabs.fortune.service.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today is your lucky day";
	}

}
