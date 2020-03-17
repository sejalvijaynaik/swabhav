package com.techlabs.observer.pattern.test;

import com.techlabs.observer.pattern.obervers.ObserverAddition;
import com.techlabs.observer.pattern.obervers.ObserverMultiplication;
import com.techlabs.observer.pattern.obervers.ObserverSubtraction;
import com.techlabs.observer.pattern.subject.numbers.SubjectNumbers;

public class OberverPatternTest {

	public static void main(String[] args) {
		
		SubjectNumbers subjectNumbers = new SubjectNumbers();
		
		ObserverAddition observerAddition = new ObserverAddition(subjectNumbers);
		ObserverSubtraction observerSubtraction = new ObserverSubtraction(subjectNumbers);
		ObserverMultiplication observerMultiplication = new ObserverMultiplication(subjectNumbers);
		
		subjectNumbers.setNumbers(20, 10);
		subjectNumbers.setNumbers(100, 200);
		subjectNumbers.setNumbers(5, 3);
	}
}
