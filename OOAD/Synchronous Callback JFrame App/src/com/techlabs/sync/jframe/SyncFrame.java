package com.techlabs.sync.jframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SyncFrame {
	
	public static void main(String[] args) {
		
		JFrame syncFrame = new JFrame("Sync Frame");
		
		JButton frameButton = new JButton("New Frmae");
		frameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame newFrame = new JFrame("new frame");
				newFrame.setSize(100, 200);
				newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				newFrame.setVisible(true);
			}
		});
		
		syncFrame.add(frameButton, BorderLayout.SOUTH);
		syncFrame.setSize(100, 200);
		syncFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		syncFrame.setVisible(true);
	}

}
