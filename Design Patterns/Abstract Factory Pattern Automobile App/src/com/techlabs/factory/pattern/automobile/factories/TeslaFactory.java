package com.techlabs.factory.pattern.automobile.factories;

import com.techlabs.factory.pattern.automobiles.Tesla;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iaotumobile.factory.IAutomobileFactory;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class TeslaFactory implements IAutomobileFactory {

	@Override
	public IAutomobile make(Autotype type) {

		if(type == Autotype.TESLA) {
			return new Tesla();
		}
		return null;
	}
}
