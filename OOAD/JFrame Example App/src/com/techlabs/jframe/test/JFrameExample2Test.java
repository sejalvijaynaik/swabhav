package com.techlabs.jframe.test;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExample2Test {
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("JFrameExample2");
		jFrame.setSize(500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBounds(10, 10, 10, 10);
		jPanel1.setBackground(Color.black);
		
		jFrame.add(jPanel1);
		
	}

}
