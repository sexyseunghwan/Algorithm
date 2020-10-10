package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestPage {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cycle = Integer.parseInt(br.readLine());//몇번 싸이클 돌건지 정해준다.
		
		StringBuffer sb = new StringBuffer();//스트링버퍼
		
		int popIndex = 0;
		int size = 0;
		int index = 0;
		
		int[] queue = new int[cycle];
		
		for (int i = 0; i < cycle; i++) {
			
			String[] input = br.readLine().split(" ");
			
			String command = input[0];
			
			if (input.length == 2) {
				//push 를 수행한다.
				queue[index] = Integer.parseInt(input[1]);
				index++;
				size++;
				
			} else {
				//push 이외 모두를 뜻함.
				if(command.equals("pop")) {
					
					if (size == 0) {
						sb.append("-1\n");
					} else {
						sb.append(queue[popIndex] + "\n");
						popIndex++;
						size--;
					}

				} else if (command.equals("size")) {
					
					sb.append(size + "\n");
					
				} else if (command.equals("empty")) {
					
					if (size == 0) sb.append("1\n");
					else sb.append("0\n");
					
				} else if (command.equals("front")) {
					
					if (size == 0) sb.append("-1\n");
					else sb.append(queue[popIndex] + "\n");
					
				} else {
					//back 인 경우
					if (size == 0) sb.append("-1\n");
					else sb.append(queue[index-1] + "\n");
				}
			}
			
		}//for
		
		bw.write(sb + "");
		br.close();
		bw.close();
		
		
	}
}




