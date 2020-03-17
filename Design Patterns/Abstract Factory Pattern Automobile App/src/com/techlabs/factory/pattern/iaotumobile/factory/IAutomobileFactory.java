package com.techlabs.factory.pattern.iaotumobile.factory;

import com.techlabs.factory.pattern.autoype.Autotype;
import com.techlabs.factory.pattern.iautomobile.IAutomobile;

public interface IAutomobileFactory {

	public IAutomobile make(Autotype type);
}
