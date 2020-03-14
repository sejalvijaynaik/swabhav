package com.techlabs.tictactoe.frameinterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.techlabs.tictactoe.game.GameFixed3;
import com.techlabs.tictactoe.game.GameVariable;
import com.techlabs.tictactoe.game.IGameable;
import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.player.Player;

public class TictactoeFrameInterface {

	JFrame userInfoFrame;
	JFrame gameFrame;
	IGameable iGameable;
	List<Player> players;
	boolean addToken;
	int size;

	public TictactoeFrameInterface() {

		userInfoFrame = new JFrame("TicTacToe User Info");
		players = new ArrayList<Player>();
	}

	public void start() {

		JLabel nameLabel1 = new JLabel("Player 1 name :");
		JLabel nameLabel2 = new JLabel("Player 2 name :");
		JLabel setSizeLabel = new JLabel("Size of game :");

		JTextField nameTextField1 = new JTextField();
		JTextField nameTextField2 = new JTextField();
		JTextField setSizeTextField = new JTextField();

		JButton submitButton = new JButton("Submit");

		userInfoFrame.add(nameLabel1);
		userInfoFrame.add(nameTextField1);
		userInfoFrame.add(nameLabel2);
		userInfoFrame.add(nameTextField2);
		userInfoFrame.add(setSizeLabel);
		userInfoFrame.add(setSizeTextField);
		userInfoFrame.add(submitButton);

		userInfoFrame.setLayout(new GridLayout(4, 2));
		userInfoFrame.setSize(200, 200);
		userInfoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userInfoFrame.setVisible(true);

		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String playerName = nameTextField1.getText();
				Player player1 = new Player(playerName);

				playerName = nameTextField2.getText();
				Player player2 = new Player(playerName);

				players.add(player1);
				players.add(player2);

				String sizeInString = setSizeTextField.getText();
				size = Integer.parseInt(sizeInString);

				ticTacToeFrame();
			}
		});

	}

	private void ticTacToeFrame() {

		if (size == 3) {
			iGameable = new GameFixed3(players);
		} else {
			iGameable = new GameVariable(players, size);
		}

		gameFrame = new JFrame("TicTacToe Game");

		JPanel northPanel = new JPanel();
		JLabel userTurnLabel = new JLabel(iGameable.getCurrentPlayer().getName() + "'s turn : Play:" + iGameable.getCurrentPlayer().getMark().toString());
		JLabel cellTakemLabel = new JLabel();
		northPanel.setLayout(new GridLayout(2, 1));
		northPanel.add(userTurnLabel);
		northPanel.add(cellTakemLabel);

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(3, 3));

		JButton[][] buttons = new JButton[size][size];

		int boardNumber = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				boardNumber++;
				buttons[i][j] = new JButton();
				buttons[i][j].setName(String.valueOf(boardNumber));
				buttons[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						JButton buttonClicked = (JButton)e.getSource();
						int userCellInputNumber = Integer.parseInt(buttonClicked.getName()); 
						Player currentPlayer = iGameable.getCurrentPlayer();
						iGameable.play(userCellInputNumber);
						if(iGameable.isAddToken() == true) {
							cellTakemLabel.setText("");
							buttonClicked.setText(currentPlayer.getMark().toString());
							userTurnLabel.setText(iGameable.getCurrentPlayer().getName() + "'s turn : Play:" + iGameable.getCurrentPlayer().getMark().toString());
						}
						else {
							cellTakemLabel.setText("Cell taken, click some other board cell");
						}
						
						if (iGameable.getGameStatus() == GameStatus.WIN) {
							
							userTurnLabel.setText(currentPlayer.getName() + " WINS!!!");
							return;
						}

						if (iGameable.getGameStatus() == GameStatus.DRAW) {
							userTurnLabel.setText("No one wins, its a draw");
							return;
						}
					}
				});
				southPanel.add(buttons[i][j]);
			}
		}
		gameFrame.setLayout(new GridLayout(2, 1));
		gameFrame.add(northPanel);
		gameFrame.add(southPanel);
		gameFrame.setSize(100, 200);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
	}
}
