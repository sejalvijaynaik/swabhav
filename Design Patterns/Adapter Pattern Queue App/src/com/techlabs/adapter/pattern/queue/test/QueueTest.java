package com.techlabs.adapter.pattern.queue.test;

import com.techlabs.adapter.pattern.queue.adapter.QueueAdapter;

public class QueueTest {
	
	public static void main(String[] args) {
		
		QueueAdapter<Integer> queueInt = new QueueAdapter<Integer>();
		
		queueInt.enqueue(10);
		queueInt.enqueue(20);
		queueInt.enqueue(30);
		
		System.out.println("Initial count : " + queueInt.count());
		queueInt.dequeue();
		System.out.println("Final Count : " + queueInt.count());
		
		for(int i : queueInt) {
			System.out.println(i);
		}
		
		QueueAdapter<String> queueString = new QueueAdapter<String>();
		
		queueString.enqueue("abc");
		queueString.enqueue("xyz");
		queueString.enqueue("mno");
		
		System.out.println("Initial count : " + queueString.count());
		queueString.dequeue();
		System.out.println("Final Count : " + queueString.count());
		
		for(String str : queueString) {
			System.out.println(str);
		}
	}
}
