package com.techlabs.custom.frame.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.techlabs.custom.frame.ByeFrame;
import com.techlabs.custom.frame.HiFrame;

public class CustomFrameTest {
	
JFrame clickFrame;
	
	public CustomFrameTest() {
		clickFrame = new JFrame("Click");
	}

	public static void main(String[] args) {

		CustomFrameTest customFrameTest = new CustomFrameTest();
		customFrameTest.clickFrame();
	}
	
	public void clickFrame() {
		
		JButton clickButton = new JButton("CLICK");
		clickButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				HiFrame hiFrame = new HiFrame();
				ByeFrame byeFrame = new ByeFrame();
			}
		});
		
		clickFrame.add(clickButton);
		clickFrame.setSize(100, 100);
		clickFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clickFrame.setVisible(true);
	}

}
