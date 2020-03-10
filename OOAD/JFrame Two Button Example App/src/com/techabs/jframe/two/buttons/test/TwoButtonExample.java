package com.techabs.jframe.two.buttons.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TwoButtonExample implements ActionListener {

	JFrame jFrame;
	
	public TwoButtonExample() {
		jFrame = new JFrame("Two buttons");
	}

	public static void main(String[] args) {

		TwoButtonExample twoButtonExample = new TwoButtonExample();
		twoButtonExample.buttons();
	}

	public void buttons() {

		JButton redButton = new JButton("Red");
		redButton.setActionCommand("red");
		redButton.addActionListener(this);
		jFrame.add(redButton);
		
		JButton blueButton = new JButton("Blue");
		blueButton.setActionCommand("blue");
		blueButton.addActionListener(this);
		jFrame.add(blueButton);

		jFrame.getContentPane().setBackground(Color.black);
		jFrame.setLayout(new FlowLayout());
		jFrame.setSize(100, 100);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equalsIgnoreCase("red")) {
			jFrame.getContentPane().setBackground(Color.red);
		}
		if(e.getActionCommand().equalsIgnoreCase("blue")) {
			jFrame.getContentPane().setBackground(Color.blue);
		}
	}
}
