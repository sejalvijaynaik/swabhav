package com.techlabs.jfarme.hello;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Hello implements ActionListener {
	
	JFrame jFrame;
	JTextField nameTextField;

	public Hello() {
		jFrame = new JFrame("Hello");
	}
	
	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.helloFrame();
	}
	
	public void helloFrame() {
		
		JLabel helloLabel = new JLabel("Hello");
		jFrame.add(helloLabel, BorderLayout.NORTH);
		
		JLabel enterNameLabel = new JLabel("Enter your name :");
		jFrame.add(enterNameLabel, BorderLayout.WEST);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(10, 10, 50, 10);
		jFrame.add(nameTextField, BorderLayout.CENTER);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		jFrame.add(submitButton, BorderLayout.SOUTH);
		
		jFrame.setSize(200, 200);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = nameTextField.getText();
		JFrame helloFame = new JFrame("Hello name");
		
		JLabel nameJLabel = new JLabel("Hello "+ name);
		helloFame.add(nameJLabel, BorderLayout.CENTER);
		
		helloFame.setSize(200, 200);
		helloFame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		helloFame.setVisible(true);
	}
}
