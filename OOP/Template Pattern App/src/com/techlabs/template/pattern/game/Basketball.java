package com.techlabs.template.pattern.game;

public class Basketball extends Game {

	@Override
	public void start() {

		System.out.println("Basketball game started");
	}

	@Override
	public void halfTime() {
		System.out.println("Basketball halftime");

	}

	@Override
	public void resume() {
		System.out.println("Basketball game resumed");

	}

	@Override
	public void stop() {
		System.out.println("Basketball game stopped");

	}

}
