package com.techlabs.template.pattern.game;

public abstract class Game {

	public abstract void start();

	public abstract void halfTime();

	public abstract void resume();

	public abstract void stop();

	public final void play() {
		start();
		halfTime();
		resume();
		stop();
	}
}
