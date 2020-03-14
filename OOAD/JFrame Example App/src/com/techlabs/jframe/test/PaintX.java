package com.techlabs.jframe.test;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PaintX extends JPanel{
	
	public void paint(Graphics g) {
		g.drawLine(0, 0, 10, y2);
	}

}
