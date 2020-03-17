package com.techlabs.factory.pattern.automobiles;

import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class Tesla implements IAutomobile {

	@Override
	public void start() {

		System.out.println("Tesla starts");
		System.out.println(this.hashCode());
	}

	@Override
	public void stop() {

		System.out.println("Tesla stops");
	}
}
