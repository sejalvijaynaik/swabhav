package com.techlabs.adapter.pattern.queue.adapter;

import java.util.Iterator;
import java.util.LinkedList;

import com.techabs.adapter.pattern.iqueue.IQueue;

public class QueueAdapter<T> implements IQueue<T> {

	LinkedList<T> queue = new LinkedList<T>();

	@Override
	public void enqueue(T item) {
		queue.addLast(item);
	}

	@Override
	public void dequeue() {
		queue.removeFirst();
	}

	@Override
	public int count() {
		int count = queue.size();
		return count;
	}

	/*@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}*/
}
