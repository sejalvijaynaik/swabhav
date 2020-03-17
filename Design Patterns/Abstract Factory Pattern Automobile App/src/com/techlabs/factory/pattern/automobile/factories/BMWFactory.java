package com.techlabs.factory.pattern.automobile.factories;

import com.techlabs.factory.pattern.automobiles.BMW;
import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iaotumobile.factory.IAutomobileFactory;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public class BMWFactory implements IAutomobileFactory {

	@Override
	public IAutomobile make(Autotype type) {

		if(type == Autotype.BMW) {
			return new BMW();
		}
		return null;
	}
}
