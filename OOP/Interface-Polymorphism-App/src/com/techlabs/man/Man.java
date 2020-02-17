package com.techlabs.man;

import com.techlabs.iemotionable.IEmotionable;
import com.techlabs.isocializable.ISocializable;

public class Man implements ISocializable,IEmotionable {

	@Override
	public void wish() {
		System.out.println("Man wishes good morning");		
	}

	@Override
	public void bye() {
		System.out.println("Man says Bye bye");		
	}

	@Override
	public void greet() {
		System.out.println("Man greets Hello");		
	}
}
