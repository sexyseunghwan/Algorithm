package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Queue10845 {
	
	/*
	 문제
	정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
	
	명령은 총 여섯 가지이다.
	
	push X: 정수 X를 큐에 넣는 연산이다.
	pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 큐에 들어있는 정수의 개수를 출력한다.
	empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	입력
	첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
	둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
	문제에 나와있지 않은 명령이 주어지는 경우는 없다.
	
	출력
	출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
	
	예제 입력 1 
	15
	push 1
	push 2
	front
	back
	size
	empty
	pop
	pop
	pop
	size
	empty
	pop
	push 3
	empty
	front
	
	예제 출력 1 
	1
	2
	2
	0
	1
	2
	-1
	0
	1
	-1
	0
	3
	 
	 
	 * */
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		List<Integer> list = new ArrayList<Integer>();//queue라고 생각
		
		StringBuffer sb = new StringBuffer();//스트링 버퍼
		
		int input = Integer.parseInt(br.readLine());//명령의 수
		
		for (int i = 0; i < input; i++) {
			
			String[] commands = br.readLine().split(" ");//명령
			
			if (commands.length == 1) {
				//명령이 단일값 -> front,back,size,pop,empty
				String command = commands[0];
				
				if (command.equals("front")) {
					
					if (list.size() != 0) {
						sb.append(list.get(0)+"\n");
					} else {
						sb.append("-1\n");
					}
					
				} else if (command.equals("back")) {
					
					if (list.size() != 0) {
						sb.append(list.get(list.size()-1) + "\n");
					} else {
						sb.append("-1\n");
					}
					
				} else if (command.equals("size")) {
					
					sb.append(list.size() + "\n");
					
				} else if (command.equals("pop")) {
					
					if (list.size() != 0) {
						sb.append(list.remove(0) + "\n");
					} else {
						sb.append("-1\n");
					}
					
				} else if (command.equals("empty")) {
					
					if (list.size() == 0) {
						sb.append("1\n");
					} else {
						sb.append("0\n");
					}
				}
				
				
			} else {
				//명령이 복합값 -> push
				
				int inputNum = Integer.parseInt(commands[1]);//들어갈 숫자
				
				list.add(inputNum);
				
			}
			
			
		}//for
		
		bw.write(sb + "");
		br.close();
		bw.close();
		
	}
}
