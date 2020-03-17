package com.techlabs.factory.pattern.automobile.test;

import com.techlabs.factory.pattern.automobile.factory.producer.AutomobileFactoryProducer;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iaotumobile.factory.IAutomobileFactory;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class AutomobileTest {
	
	public static void main(String[] args) {
		
		AutomobileFactoryProducer automobileFactoryProducer = new AutomobileFactoryProducer();
		IAutomobileFactory iAutomobileFactory = automobileFactoryProducer.make(Autotype.AUDI);
		
		IAutomobile iAutomobile = iAutomobileFactory.make(Autotype.AUDI);
		iAutomobile.start();
		iAutomobile.stop();
		System.out.println(iAutomobile.getClass());
	}
}
