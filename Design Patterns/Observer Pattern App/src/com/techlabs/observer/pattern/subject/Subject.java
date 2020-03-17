package com.techlabs.observer.pattern.subject;

import com.techlabs.observer.pattern.observer.Observer;

public interface Subject {
	
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver();
}
