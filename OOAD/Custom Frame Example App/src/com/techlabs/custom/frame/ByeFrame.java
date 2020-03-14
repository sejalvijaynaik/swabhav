package com.techlabs.custom.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ByeFrame extends JFrame {
	
	JLabel byeLabel;

	public ByeFrame() {
		super("Hi");
		byeLabel = new JLabel("BYE");
		add(byeLabel);
		setSize(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
