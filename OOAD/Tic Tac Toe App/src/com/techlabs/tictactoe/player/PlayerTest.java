package com.techlabs.tictactoe.player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.mark.Mark;

class PlayerTest {

	@Test
	void test() {

		Player player1 = new Player(1, "lolo");
		player1.setMark(Mark.X);
		
		Player player2 = new Player(2, "yoyo");
		player2.setMark(Mark.O);
		
		System.out.println(player1.getId());
		System.out.println(player1.getName());
		System.out.println(player1.getMark());
		System.out.println();
		System.out.println(player2.getId());
		System.out.println(player2.getName());
		System.out.println(player2.getMark());
		
		
	}

}
