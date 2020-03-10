package com.techlabs.jframe.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExample1Test {
	
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("JFrameExample1");
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 2");
		JButton button4 = new JButton("Button 2");
		JButton button5 = new JButton("Button 2");

		jFrame.add(button1);
		jFrame.add(button2);
		jFrame.add(button3);		
		jFrame.add(button4);		
		jFrame.add(button5);		
		
		/*jFrame.add(button1, BorderLayout.WEST);
		jFrame.add(button2, BorderLayout.EAST);
		jFrame.add(button3, BorderLayout.CENTER);
		jFrame.add(button4, BorderLayout.NORTH);
		jFrame.add(button5, BorderLayout.SOUTH);*/
		
		//jFrame.setLayout(new FlowLayout());
		
		//jFrame.setLayout(new GridLayout(3, 3));
		
		jFrame.setSize(100, 200);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}
