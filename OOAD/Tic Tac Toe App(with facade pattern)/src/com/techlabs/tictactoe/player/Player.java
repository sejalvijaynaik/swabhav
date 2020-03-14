package com.techlabs.tictactoe.player;

import com.techlabs.tictactoe.mark.Mark;

public class Player {

	private String name;
	Mark mark;

	public Player(String name) {
		this.name = name;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}
}
