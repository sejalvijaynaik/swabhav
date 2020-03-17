package com.techlabs.observer.pattern.obervers;

import com.techlabs.observer.pattern.observer.Observer;
import com.techlabs.observer.pattern.subject.Subject;

public class ObserverAddition implements Observer{

	private Subject subjectNumbers;
	private int number1, number2;

	public ObserverAddition(Subject subjectNumbers) {
		this.subjectNumbers = subjectNumbers;
		this.subjectNumbers.registerObserver(this);
	}

	@Override
	public void update(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		addition();
	}

	private void addition() {
		System.out.println("Addition of " + number1 + " and " + number2 + " : " + (number1 + number2));
	}
}
