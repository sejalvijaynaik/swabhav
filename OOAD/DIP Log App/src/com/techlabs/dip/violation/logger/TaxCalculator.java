package com.techlabs.dip.violation.logger;

public class TaxCalculator {
	
	Logtype logtype;

	public TaxCalculator(Logtype logtype) {
		this.logtype = logtype;
	}

	public Logtype getLogtype() {
		return logtype;
	}
	
	public double calculator(int amount, float taxPercentage) {
		
		double tax = amount * taxPercentage / 100f;
		
		if(logtype == Logtype.TXT) {
			new TextLogger().log();
			return tax;
		}
		new XmlLogger().log();
		return tax;
	}
}
