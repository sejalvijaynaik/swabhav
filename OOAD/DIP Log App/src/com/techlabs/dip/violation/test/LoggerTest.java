package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.logger.Logtype;
import com.techlabs.dip.violation.logger.TaxCalculator;

public class LoggerTest {
	
	public static void main(String[] args) {
		
		TaxCalculator taxCalculator = new TaxCalculator(Logtype.ENUM);
		
		double tax = taxCalculator.calculator(1000, 5);
		
		System.out.println("Tax :" + tax);
	}
}
