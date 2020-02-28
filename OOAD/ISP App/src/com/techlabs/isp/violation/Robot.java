package com.techlabs.isp.violation;

public class Robot implements IWorker{

	@Override
	public void eat() {
		System.out.println("Robot eating???");
	}

	@Override
	public void work() {
		System.out.println("Robot working");
	}
}
