package com.techlabs.tictactoe.player;

import com.techlabs.tictactoe.mark.Mark;

public class Player {

	private int id;
	private String name;
	Mark mark;

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
