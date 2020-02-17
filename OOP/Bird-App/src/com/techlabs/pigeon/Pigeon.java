package com.techlabs.pigeon;

import com.techlabs.birdabstract.BirdAbstract;
import com.techlabs.birdinterface.BirdInterface;

public class Pigeon extends BirdAbstract implements BirdInterface {

	@Override
	public void flyAbstract() {
		System.out.println("Pigeon is flying");
	}

	@Override
	public void flyInterface() {
		System.out.println("Pigeon is flying");
	}
}
