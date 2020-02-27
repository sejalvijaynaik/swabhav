package com.techlabs.strategy.pattern;

public class Multiplication implements IOperable{

	@Override
	public int operationTwoNumbers(int num1, int num2) {
		return (num1 * num2);
	}

}
