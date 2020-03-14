package com.techlabs.jframe.test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormExample implements ActionListener {
	
	JFrame jFrame;
	JTextField idTextField1;
	JTextField idTextField2;
	JTextField nameTextField1;
	JTextField nameTextField2;
	JTextField setSizeTextField;

	public FormExample() {
		jFrame = new JFrame("Form");
	}
	
	public static void main(String[] args) {
		
		FormExample formExample = new FormExample();
		formExample.form();
	}
	
	public void form() {
		
		JLabel idLabel1 = new JLabel("Player 1 id :");
		JLabel idLabel2 = new JLabel("Player 2 id :");
		JLabel nameLabel1 = new JLabel("Player 1 name :");
		JLabel nameLabel2 = new JLabel("Player 2 name :");
		JLabel setSizeLabel = new JLabel("Size of game :");
		
		idTextField1 = new JTextField();
		idTextField2 = new JTextField();
		nameTextField1 = new JTextField();
		nameTextField2 = new JTextField();
		setSizeTextField = new JTextField();
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		
		jFrame.add(idLabel1);
		jFrame.add(idTextField1);
		jFrame.add(idLabel2);
		jFrame.add(idTextField2);
		jFrame.add(nameLabel1);
		jFrame.add(nameTextField1);
		jFrame.add(nameLabel2);
		jFrame.add(nameTextField2);
		jFrame.add(setSizeLabel);
		jFrame.add(setSizeTextField);
		jFrame.add(submitButton);

		jFrame.setLayout(new GridLayout(6, 2));
		jFrame.setSize(200, 200);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(idTextField1.getText());
	}
}
