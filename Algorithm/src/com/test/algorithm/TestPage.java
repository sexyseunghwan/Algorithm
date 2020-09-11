package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class TestPage {
	public static void main(String[] args) throws Exception{
		
		List<Integer> compList = new ArrayList<Integer>();//비교리스트.
		
		for (int i = 1; i <= 10; i++) {
			compList.add(i);
		}
		
		compList.remove(0);		
		
		System.out.println(compList);
		
		
		
	}
}





