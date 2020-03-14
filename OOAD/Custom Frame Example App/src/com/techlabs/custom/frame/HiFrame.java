package com.techlabs.custom.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HiFrame extends JFrame {
	
	JLabel hiLabel;
	public HiFrame() {
		super("Hi");
		hiLabel = new JLabel("HI");
		add(hiLabel);
		setSize(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
