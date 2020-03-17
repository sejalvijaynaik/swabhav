package com.techlabs.factory.pattern.automobile.factory.producer;

import com.techlabs.factory.pattern.automobile.factories.AudiFactory;
import com.techlabs.factory.pattern.automobile.factories.BMWFactory;
import com.techlabs.factory.pattern.automobile.factories.TeslaFactory;
import com.techlabs.factory.pattern.automobiles.Audi;
import com.techlabs.factory.pattern.automobiles.BMW;
import com.techlabs.factory.pattern.automobiles.Tesla;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iaotumobile.factory.IAutomobileFactory;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class AutomobileFactoryProducer {
	
	private IAutomobileFactory iAutomobileFactory;
	
	public IAutomobileFactory make(Autotype type) {
		
		if(type == Autotype.AUDI) {
			iAutomobileFactory = new AudiFactory();
			return iAutomobileFactory;
		}
		if(type == Autotype.BMW) {
			iAutomobileFactory = new BMWFactory();
			return iAutomobileFactory;
		}
		iAutomobileFactory = new TeslaFactory();
		return iAutomobileFactory;
	}
}
