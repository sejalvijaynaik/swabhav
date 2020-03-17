package com.techlabs.factory.pattern.automobile.test;

import com.techlabs.factory.pattern.automobile.factory.producer.AutomobileFactorySingleton;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class AutomobileSingletonTest {
	
	public static void main(String[] args) {
		
		IAutomobile iAutomobile = AutomobileFactorySingleton.getInstance(Autotype.AUDI);
		System.out.println(iAutomobile.getClass());
		iAutomobile.start();
		iAutomobile.stop();
		
		iAutomobile = AutomobileFactorySingleton.getInstance(Autotype.BMW);
		System.out.println(iAutomobile.getClass());
		iAutomobile.start();
		iAutomobile.stop();
	}
}
