package com.test.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TestPage {
	public static void main(String[] args) throws Exception {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list.get(0));
		System.out.println("삭제되는 숫자 : " + list.remove(0));
		
		System.out.println(list.get(0));
		
	}
}




