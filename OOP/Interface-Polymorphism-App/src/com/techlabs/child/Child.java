package com.techlabs.child;

import com.techlabs.iemotionable.IEmotionable;

public class Child implements IEmotionable {

	@Override
	public void wish() {
		System.out.println("Child wishes good morning");		
	}

	@Override
	public void bye() {
		System.out.println("Child says Bye bye");		
	}
}
