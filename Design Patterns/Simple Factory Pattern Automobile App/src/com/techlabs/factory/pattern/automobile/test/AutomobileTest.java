package com.techlabs.factory.pattern.automobile.test;

import com.techlabs.factory.pattern.automobile.factory.AutomobileFactory;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class AutomobileTest {
	
	public static void main(String[] args) {
		
		AutomobileFactory automobileFactory = new AutomobileFactory();
		IAutomobile iAutomobile = automobileFactory.make(Autotype.TESLA);
		System.out.println(iAutomobile.getClass());
		
		iAutomobile.start();
		iAutomobile.stop();
	}
}
