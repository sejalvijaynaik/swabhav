package com.techlabs.tictactoe.game;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.mark.Mark;
import com.techlabs.tictactoe.player.Player;

class GameTest {

	@Test
	void test() {

		int size = 3;
		Player player1 = new Player(1, "lolo");
		
		Player player2 = new Player(2, "yoyo");
		
		List<Player> players = new ArrayList<Player>();
		players.add(player1);
		players.add(player2);
		
		Game game = new Game(players, size);
		
		game.addXO(1, game.getPlayers().get(0).getMark());
		game.addXO(4, game.getPlayers().get(1).getMark());
		game.addXO(3, game.getPlayers().get(0).getMark());
		game.addXO(2, game.getPlayers().get(1).getMark());
		game.addXO(5, game.getPlayers().get(0).getMark());
		//game.addXO(9, game.getPlayers().get(0).getMark());
		//game.addXO(6, game.getPlayers().get(0).getMark());
		game.addXO(9, game.getPlayers().get(0).getMark());

		boolean match = game.getResultAnalyzer().checkStatus(game.getPlayers().get(1).getMark());
		
		for(int i = 0; i < game.getBoard().getSize(); i++) {
			for(int j = 0; j < game.getBoard().getSize(); j++) {
				System.out.print(game.getBoard().getCells()[i][j].getMark());
			}
			System.out.println();
		}
		
		System.out.println(match);
	}
}
