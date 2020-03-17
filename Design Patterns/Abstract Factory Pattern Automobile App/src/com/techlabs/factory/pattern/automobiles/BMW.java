package com.techlabs.factory.pattern.automobiles;

import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class BMW implements IAutomobile{

	@Override
	public void start() {

		System.out.println("BMW starts");
		System.out.println(this.hashCode());
	}

	@Override
	public void stop() {

		System.out.println("BMW stops");
	}

}
