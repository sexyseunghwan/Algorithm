package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RotateQueue1021 {
	public static void main(String[] args) throws Exception{
		
		//m1();
		m2();
		
		
		
		
		
		
	}

	private static void m2() throws Exception {
		
		//2. 큐를 이용한 방법
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input1 = br.readLine().split(" ");
		
		int queueSize = Integer.parseInt(input1[0]);//큐의크기
		int pickNum = Integer.parseInt(input1[1]);//뽑으려 하는 수의 개수
		
		//비교리스트.
		List<Integer> compList = new ArrayList<Integer>();
		
		for (int i = 0; i < queueSize; i++) {
			
		}
		
		//큐 생성. -> 1 ~ qeueSize 만큼의 숫자를 넣어줄 큐를 만들어주는것이다.(자연수의 큐)
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//큐에 자연수를 넣어줄 것이다 차례로
		for (int i = 1; i <= queueSize; i++) {
			queue.offer(i);
		}
		
		//뽑고싶은 숫자.
		int[] pickList = new int[pickNum];
		
		String[] input2 = br.readLine().split(" ");
		
		//뽑고싶은 숫자를 리스트에 넣어준다.
		for (int i = 0; i < input2.length; i++) {
			pickList[i] = Integer.parseInt(input2[i]);//문자를 숫자형으로 변환해서 정수 리스트에 집어넣는다.
		}
		
		int answerCount = 0;//2,3번째 연산을 몇회 시행하였는지.
		int pickIndex = 0;//pickList 를 카운트 해줄것이다.
		
		
		while(pickIndex < pickList.length) {
			
			if (pickList[pickIndex] == queue.peek()) {
				//내가 찾던 숫자인 경우
				queue.poll();//해당 숫자를 꺼낸다.
			} else {
				//내가 찾던 숫자가 아닌경우.
				
			}
			
		}
		
	}

	private static void m1() throws Exception {
		//1. 리스트를 이용한 방법.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input1 = br.readLine().split(" ");
		
		int queueSize = Integer.parseInt(input1[0]);//큐의크기
		int pickNum = Integer.parseInt(input1[1]);//뽑으려 하는 수의 개수
		
		//큐의 역할을 수행하는 리스트 생성
		int[] queue = new int[queueSize];
		
		for (int i = 1; i <= queueSize; i++) {
			queue[i-1] = i;	
		}
		
		
		//뽑고싶은 숫자.
		int[] pickList = new int[pickNum];
		
		String[] input2 = br.readLine().split(" ");
		
		//뽑고싶은 숫자를 리스트에 넣어준다.
		for (int i = 0; i < input2.length; i++) {
			pickList[i] = Integer.parseInt(input2[i]);//문자를 숫자형으로 변환해서 정수 리스트에 집어넣는다.
		}
		
		int answerCount = 0;//2,3번째 연산을 몇회 시행하였는지. -> 최종답 산출물.
		int pickIndex = 0;//pickList 를 카운트 해줄것이다.
		
//		while(pickIndex < pickList.length) {
//			pickList[index]
//		}
		
		for (int i = 0; i < pickList.length; i++) {
			
			
			
		}
		
		
	}
}
