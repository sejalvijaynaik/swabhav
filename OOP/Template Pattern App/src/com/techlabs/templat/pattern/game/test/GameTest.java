package com.techlabs.templat.pattern.game.test;

import com.techlabs.template.pattern.game.Basketball;
import com.techlabs.template.pattern.game.Football;
import com.techlabs.template.pattern.game.Game;

public class GameTest {

	public static void main(String[] args) {
		
		Game game = new Football();
		game.play();
		
		game = new Basketball();
		game.play();
	}
}
