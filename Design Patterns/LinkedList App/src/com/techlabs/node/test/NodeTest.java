package com.techlabs.node.test;

import com.techlabs.node.Node;

public class NodeTest {
	
	public static void main(String[] args) {
		
		Node<String> first = new Node<String>();
		first.setData("Swabhav");
		
		Node<String> second = new Node<String>();
		second.setData("Techlabs");
		
		Node<String> third = new Node<String>();
		third.setData("Andheri");
		
		first.setNext(second);
		second.setNext(third);
		third.setNext(null);
		
		printInfo(first);
		
		Node<Double> firstI = new Node<Double>();
		firstI.setData(10.0);
		
		Node<Double> secondI = new Node<Double>();
		secondI.setData(20.0);
		
		Node<Double> thirdI = new Node<Double>();
		thirdI.setData(30.0);
		
		firstI.setNext(secondI);
		secondI.setNext(thirdI);
		thirdI.setNext(null);
		
		printInfo(firstI);
	}
	
	public static void printInfo(Node node)
	{
		while(node.getNext() != null) {
			System.out.println(node.getData());
			node= node.getNext();
		}
		System.out.println(node.getData());
	}
}
