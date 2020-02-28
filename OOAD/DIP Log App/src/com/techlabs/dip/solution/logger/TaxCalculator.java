package com.techlabs.dip.solution.logger;

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
		ILogable iLogable;
		
		if(logtype == Logtype.TXT) {
			iLogable = new TextLogger();
		}
		else {
			iLogable = new XmlLogger();
		}
		iLogable.log();
		return tax;
	}
}
