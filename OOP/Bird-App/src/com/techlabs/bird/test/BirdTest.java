package com.techlabs.bird.test;

import com.techlabs.batman.Batman;
import com.techlabs.birdabstract.BirdAbstract;
import com.techlabs.birdinterface.BirdInterface;
import com.techlabs.crow.Crow;
import com.techlabs.parrot.Parrot;
import com.techlabs.pigeon.Pigeon;

public class BirdTest {
	public static void main(String[] args) {
		BirdAbstract parrotAbstract = new Parrot();
		BirdAbstract crowAbstract = new Crow();
		BirdAbstract pigeonAbstract = new Pigeon();
		BirdAbstract batmanAbstarct = new Batman();
		
		printInfoAbstract(parrotAbstract);
		printInfoAbstract(crowAbstract);
		printInfoAbstract(pigeonAbstract);
		printInfoAbstract(batmanAbstarct);
		
		BirdInterface parrotInterface = new Parrot();
		BirdInterface crowInterface = new Crow();
		BirdInterface pigeonInterface = new Pigeon();
		
		printInfoInterface(parrotInterface);
		printInfoInterface(crowInterface);
		printInfoInterface(pigeonInterface);
	}
	
	public static void printInfoAbstract(BirdAbstract birdAbstract) {
		birdAbstract.flyAbstract();
	}
	
	public static void printInfoInterface(BirdInterface birdInterface) {
		birdInterface.flyInterface();
	}
}
