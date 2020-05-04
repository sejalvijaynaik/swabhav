package com.techlabs.display.time.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayTimeFrame {
	
	public void diplay() {
		
		JFrame jFrame = new JFrame("PrintTimeHelloFrame");
		JButton printTime = new JButton("PrintTime");
		JButton hello = new JButton("Hello");

		jFrame.add(printTime);
		jFrame.add(hello);
		
		hello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame helloFrame = new JFrame("Hello Frame");
				
				JLabel helloLabel = new JLabel("Hello");
				helloFrame.add(helloLabel);
				
				helloFrame.setSize(500, 500);
				helloFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				helloFrame.setVisible(true);
			}
		});
		
		printTime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();
				
				while(true) {
					System.out.println(dateFormat.format(date));
				}
			}
		});
		
		jFrame.setLayout(new FlowLayout());
		
		jFrame.setSize(500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}
