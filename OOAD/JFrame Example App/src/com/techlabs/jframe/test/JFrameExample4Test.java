package com.techlabs.jframe.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExample4Test extends Canvas {

	JFrame jFrame;
	JButton[][] buttons;
	int counter;

	public static void main(String[] args) {

		new JFrameExample4Test().start();
	}

	public void start() {

		jFrame = new JFrame("9 buttons");

		JPanel northPanel = new JPanel();
		northPanel.setBounds(0, 0, 200, 50);
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(3, 3));

		buttons = new JButton[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				counter++;
				buttons[i][j] = new JButton();
				buttons[i][j].setName(String.valueOf(counter));
				buttons[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JButton buttonClicked = (JButton)e.getSource();
						System.out.println(buttonClicked.getName());
						System.out.println("jsfke");
					}
				});
				southPanel.add(buttons[i][j]);
			}
		}
		jFrame.setLayout(new GridLayout(2, 1));
		jFrame.add(northPanel);
		jFrame.add(southPanel);
		jFrame.setSize(100, 200);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}
