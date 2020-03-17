package com.techlabs.factory.pattern.automobile.factories;

import com.techlabs.factory.pattern.automobiles.Audi;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iaotumobile.factory.IAutomobileFactory;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class AudiFactory implements IAutomobileFactory {

	@Override
	public IAutomobile make(Autotype type) {

		if(type == Autotype.AUDI) {
			return new Audi();
		}
		return null;
	}
}
