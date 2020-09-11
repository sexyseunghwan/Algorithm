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
		
//		Queue<Integer> queue1 = new LinkedList<Integer>();
//		Queue<Integer> queue2 = new LinkedList<Integer>();
//		
//		for (int i = 1; i <= 10; i++) {
//			queue1.offer(i);
//		}
//		
//		queue2 = queue1;
//		
//		System.out.println(queue2);
		
		//queue1.poll();//queue1이랑 연동이 되네 ㅋㅋㅋㅋㅋㅋ;;
		//queue1.poll();//queue1이랑 연동이 되네 ㅋㅋㅋㅋㅋㅋ;;
		
		//System.out.println(queue2);
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 11; i++) {
			list.add(i);
		}
		
		//list.add(list.remove(0));
		//System.out.println(list);
		
		//list.set(0, 22);
		//우측 쉬프트 알고리즘 적용해야되는거...
		
		System.out.println(list);
		
		
		
		//System.out.println(Math.ceil((list.size() / 2.0)));
		//System.out.println((list.size() / 2.0));
		
		//System.out.println(list);
		
		//System.out.println(list.remove(3));//return 을 하는 놈이네?!
		
	}
}





