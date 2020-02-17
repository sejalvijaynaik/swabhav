package com.techlabs.crow;

import com.techlabs.birdabstract.BirdAbstract;
import com.techlabs.birdinterface.BirdInterface;

public class Crow extends BirdAbstract implements BirdInterface {

	@Override
	public void flyAbstract() {
		System.out.println("crow is flying");
	}

	@Override
	public void flyInterface() {
		System.out.println("crow is flying");
	}

}
