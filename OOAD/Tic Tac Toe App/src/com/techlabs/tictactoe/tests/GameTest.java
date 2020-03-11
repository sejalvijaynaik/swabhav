package com.techlabs.tictactoe.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.analyzer.ResultAnalyzerVariable;
import com.techlabs.tictactoe.board.BoardVariable;
import com.techlabs.tictactoe.game.GameVariable;
import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.mark.Mark;
import com.techlabs.tictactoe.player.Player;

class GameTest {
	
	int size = 3;
	Player player1 = new Player(1, "lolo");
	Player player2 = new Player(2, "yoyo");
	
	List<Player> players = new ArrayList<Player>();
	
	GameVariable game;

	@BeforeEach
	void create_game_instance() {
		
		players.add(player1);
		players.add(player2);
		int size = 3;
		BoardVariable board = new BoardVariable(size);
		ResultAnalyzerVariable resultAnalyzer = new ResultAnalyzerVariable(board);
		
		game = new GameVariable(players, board, resultAnalyzer);
	}
	
	@Test
	void check_initial_board() {
		
		System.out.println("Initial board :");
	}
	
	@Test
	void print_player_info() {
		
		System.out.println("players info ------");
		for(Player tempPlayer : players) {
			
			System.out.println("Id :" + tempPlayer.getId());
			System.out.println("Name :" + tempPlayer.getName());
			System.out.println("Mark :" + tempPlayer.getMark());
		}
	}
	@Test
	void add_mark() {
		
		System.out.println("Adding marks");
		game.addXO(1, game.getPlayers().get(0).getMark());
		game.addXO(4, game.getPlayers().get(1).getMark());
		game.addXO(3, game.getPlayers().get(0).getMark());
		game.addXO(2, game.getPlayers().get(1).getMark());
		game.addXO(5, game.getPlayers().get(0).getMark());
		//game.addXO(9, game.getPlayers().get(0).getMark());
		//game.addXO(6, game.getPlayers().get(0).getMark());
		game.addXO(9, game.getPlayers().get(0).getMark());
	}
	
	@Test
	void chech_status() {

		System.out.println("Checking status");
		
		game.addXO(1, game.getPlayers().get(0).getMark());
		game.addXO(4, game.getPlayers().get(1).getMark());
		game.addXO(3, game.getPlayers().get(0).getMark());
		game.addXO(2, game.getPlayers().get(1).getMark());
		game.addXO(5, game.getPlayers().get(0).getMark());
		//game.addXO(9, game.getPlayers().get(0).getMark());
		//game.addXO(6, game.getPlayers().get(0).getMark());
		game.addXO(9, game.getPlayers().get(0).getMark());
		
		boolean match = game.getResultAnalyzer().checkStatus(game.getPlayers().get(0).getMark());
		System.out.println(match);
	}
	
	@AfterEach
	void display() {
		for(int i = 0; i < game.getBoard().getSize(); i++) {
			for(int j = 0; j < game.getBoard().getSize(); j++) {
				System.out.print(game.getBoard().getCells2DArray()[i][j].getMark());
			}
			System.out.println();
		}
	}
	
}
