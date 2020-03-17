package com.techlabs.factory.pattern.automobile.factory.producer;

import com.techlabs.factory.pattern.automobiles.Audi;
import com.techlabs.factory.pattern.automobiles.BMW;
import com.techlabs.factory.pattern.automobiles.Tesla;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class AutomobileFactorySingleton {
	
	private static IAutomobile iAutomobile;
	
	private AutomobileFactorySingleton() {
		
	}
	
	public static IAutomobile getInstance(Autotype type) {
		
		if(iAutomobile == null) {
			if(type == Autotype.AUDI) {
				iAutomobile = new Audi();
				return iAutomobile;
			}
			if(type == Autotype.BMW) {
				iAutomobile = new BMW();
				return iAutomobile;
			}
			iAutomobile = new Tesla();
			return iAutomobile;
		}
		return iAutomobile;
	}
}