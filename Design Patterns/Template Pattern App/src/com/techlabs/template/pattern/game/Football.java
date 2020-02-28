package com.techlabs.template.pattern.game;

public class Football extends Game {

	@Override
	public void start() {

		System.out.println("Football game started");
	}

	@Override
	public void halfTime() {

		System.out.println("Football halftime");
	}

	@Override
	public void resume() {
		System.out.println("Football game resumed");

	}

	@Override
	public void stop() {
		System.out.println("Football game stopped");

	}
}
