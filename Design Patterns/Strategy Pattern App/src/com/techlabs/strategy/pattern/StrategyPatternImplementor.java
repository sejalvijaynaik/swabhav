package com.techlabs.strategy.pattern;

public class StrategyPatternImplementor {
	
	IOperable iOperable;

	public StrategyPatternImplementor(IOperable iOperable) {
		this.iOperable = iOperable;
	}
	
	public int executeStrategyPatternImplementor(int num1, int num2) {
		return iOperable.operationTwoNumbers(num1, num2);
	}
}
