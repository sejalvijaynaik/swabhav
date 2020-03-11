package com.techlabs.jframe.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExample3Test {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Three buttons");
		
		JButton redButton = new JButton("red");
		redButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jFrame.getContentPane().setBackground(Color.RED);
			}
		});
		
		JButton blueButton = new JButton("blue");
		blueButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				jFrame.getContentPane().setBackground(Color.BLUE);
			}
		});
		
		jFrame.add(redButton, BorderLayout.NORTH);
		jFrame.add(blueButton, BorderLayout.SOUTH);
		
		jFrame.setSize(200, 200);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}
