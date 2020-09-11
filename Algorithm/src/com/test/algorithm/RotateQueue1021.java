package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class RotateQueue1021 {
/*
	  
문제
지민이는 N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 지민이는 이 큐에서 몇 개의 원소를 뽑아내려고 한다.

지민이는 이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.

첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다. 
(이 위치는 가장 처음 큐에서의 위치이다.) 이때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 큐의 크기 N과 뽑아내려고 하는 수의 개수 M이 주어진다. N은 50보다 작거나 같은 자연수이고, M은 N보다 작거나 같은 자연수이다. 
둘째 줄에는 지민이가 뽑아내려고 하는 수의 위치가 순서대로 주어진다. 
위치는 1보다 크거나 같고, N보다 작거나 같은 자연수이다.

출력
첫째 줄에 문제의 정답을 출력한다.

예제 입력 1 
10 3
1 2 3
예제 출력 1 
0

예제 입력 2 
10 3
2 9 5
예제 출력 2 
8

예제 입력 3 
32 6
27 16 30 11 6 23
예제 출력 3 
59

예제 입력 4 
10 10
1 6 3 2 7 9 8 4 10 5
예제 출력 4 
14	  
	 
	 * */
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input1 = br.readLine().split(" ");
		
		int queueSize = Integer.parseInt(input1[0]);//큐의크기
		int pickNum = Integer.parseInt(input1[1]);//뽑으려 하는 수의 개수
		
		//큐의 역할을 수행하는 리스트 생성
		List<Integer> queue = new ArrayList<Integer>();
		
		for (int i = 1; i <= queueSize; i++) {
			queue.add(i);
		}
		
		//뽑고싶은 숫자.
		int[] pickList = new int[pickNum];
		
		String[] input2 = br.readLine().split(" ");
		
		//뽑고싶은 숫자를 리스트에 넣어준다.
		for (int i = 0; i < input2.length; i++) {
			pickList[i] = Integer.parseInt(input2[i]);//문자를 숫자형으로 변환해서 정수 리스트에 집어넣는다.
		}
		
		int answerCount = 0;//2,3번째 연산을 몇회 시행하였는지. -> 최종답 산출물.
		
		for (int i = 0; i < pickNum; i++) {
			boolean flag = false;
			int num = pickList[i];//지금 비교할 숫자
			
			while(!flag) {
				if(queue.get(0) == num) {
					queue.remove(0);
					flag = true;
				} else {
					if (queue.indexOf(num) <= queue.size() / 2) {
						//왼쪽으로 쉬프트.
						queue.add(queue.size()-1,queue.remove(0));
					} else {
						//오른쪽으로 쉬프트.
						queue.add(0,queue.remove(queue.size()-1));
					}
					
					answerCount++;
				}
 				
			}
		}//for
		
		bw.write(answerCount + "");
		bw.close();
		
		
	}
		
}
