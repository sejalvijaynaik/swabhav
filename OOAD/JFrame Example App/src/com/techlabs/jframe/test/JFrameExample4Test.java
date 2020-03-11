package com.techlabs.jframe.test;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExample4Test extends Canvas {
	
	JFrame jFrame;
	JButton[][] buttons;
	
	public static void main(String[] args) {
		
		new JFrameExample4Test().start();
	}
	
	public void start() {
		
		jFrame = new JFrame("9 buttons");
		
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		buttons = new JButton[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				buttons[i][j] = new JButton();
				buttons[i][j].setBounds(10, 10, 20, 20);
				southPanel.add(buttons[i][j]);
			}
		}

		jFrame.add(northPanel);
		jFrame.add(southPanel);
		jFrame.setLayout(new GridLayout(3, 3));
		jFrame.setSize(100, 200);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		
		
	}
	

}
