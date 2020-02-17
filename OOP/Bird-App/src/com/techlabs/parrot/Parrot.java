package com.techlabs.parrot;

import com.techlabs.birdabstract.BirdAbstract;
import com.techlabs.birdinterface.BirdInterface;

public class Parrot extends BirdAbstract implements BirdInterface {

	@Override
	public void flyAbstract() {
		System.out.println("Parrot is flying");
	}

	@Override
	public void flyInterface() {
		System.out.println("Parrot is flying");
		
	}
}
