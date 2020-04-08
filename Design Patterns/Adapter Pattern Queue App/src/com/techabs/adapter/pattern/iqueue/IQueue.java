package com.techabs.adapter.pattern.iqueue;

public interface IQueue<T> {
	
	void enqueue(T item);
	void dequeue();
	int count();
}
