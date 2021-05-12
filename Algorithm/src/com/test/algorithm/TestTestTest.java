package com.test.algorithm;

import java.util.LinkedList;

public class TestTestTest {

	
	public static void main(String[] args) {
		
		
		LinkedListPractice lp = new LinkedListPractice();
		
		lp.addFirst("Apple");
		lp.addFirst(400);
		lp.addLast("Lastnight");
		lp.add(1, "sexy");
		
		
		System.out.println(lp.node(0));
		System.out.println(lp.node(1));
		System.out.println(lp.node(2));
		System.out.println(lp.node(3));
		
		System.out.println(lp.getSize());
		
		//LinkedList<String> list = new LinkedList<String>();
		//list.add(1, "as");
		
		//System.out.println(list.get(0));
		
		
	}
	
}
