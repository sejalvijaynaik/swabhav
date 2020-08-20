package com.techlabs.fortune.services;

import org.springframework.stereotype.Component;

import com.techlabs.fortune.service.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today is your lucky day";
	}

}
