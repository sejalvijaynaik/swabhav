package com.techlabs.strategy.pattern.test;

import com.techlabs.strategy.pattern.Addition;
import com.techlabs.strategy.pattern.Multiplication;
import com.techlabs.strategy.pattern.StrategyPatternImplementor;
import com.techlabs.strategy.pattern.Subtraction;

public class OperationTest {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5;

		StrategyPatternImplementor strategyPatternImplementor = new StrategyPatternImplementor(new Addition());
		System.out.println("Addition of " + num1 + " and " + num2 + " : " + strategyPatternImplementor.executeStrategyPatternImplementor(num1, num2));
		
		strategyPatternImplementor = new StrategyPatternImplementor(new Subtraction());
		System.out.println("Subtraction of " + num1 + " and " + num2 + " : " + strategyPatternImplementor.executeStrategyPatternImplementor(num1, num2));
		
		strategyPatternImplementor = new StrategyPatternImplementor(new Multiplication());
		System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + strategyPatternImplementor.executeStrategyPatternImplementor(num1, num2));
	}
}
