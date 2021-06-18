package com.test.algorithm;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class TestPage {
 
	public static void main(String[] args) {
		

		LinkedListTest ltt = new LinkedListTest();
		
		
		ltt.addFirst("apple");
		ltt.addFirst("samsung");
		ltt.addLast("hwawei");
		ltt.add(1, "kiss the rain");
		ltt.add(0, "oh rain");
		
		
		//System.out.println(ltt.node(0));
		//System.out.println(ltt.node(1));
		//System.out.println(ltt.node(2));
		//System.out.println(ltt.node(ltt.getSize()-1));
		
		System.out.println(ltt.toString());
		
		System.out.println(ltt.indexOf("kiss the rain"));
		
		
	}
	
}




