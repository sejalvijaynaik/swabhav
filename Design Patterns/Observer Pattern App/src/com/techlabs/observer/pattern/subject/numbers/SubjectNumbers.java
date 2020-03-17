package com.techlabs.observer.pattern.subject.numbers;

import java.util.ArrayList;
import java.util.List;
import com.techlabs.observer.pattern.observer.Observer;
import com.techlabs.observer.pattern.subject.Subject;

public class SubjectNumbers implements Subject{
	
	private List<Observer> observers;
	private int number1, number2;
	
	public SubjectNumbers() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i =0; i <observers.size(); i++) {
			observers.get(i).update(number1, number2);
		}
	}
	public void setNumbers(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		notifyObserver();
	}
}
