package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestPage {
	
	public static void main(String[] args) throws Exception {

		//나중에 해보는걸로 하자 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int cycle = Integer.parseInt(br.readLine());//몇번의 명령을 수행할건지 정해준다.
		
		int[] deck = new int[cycle];//덱 생성
		int deckIndex = 0;//덱의 인덱스
		int deckSize = 0;
		int popFront = 0;
		int popBack = 0;
		
		StringBuffer sb = new StringBuffer();//스트링버퍼 생성
		
		for (int i = 0; i < cycle; i++) {
			
			String[] inputs = br.readLine().split(" ");
			
			String command = inputs[0];//명령어
			
			if (inputs.length == 2) {
				//push 명령어
				int inputNum = Integer.parseInt(inputs[1]);
				
				if (command.equals("push_front")) {
					
					
					
				} else {
					
				}
				
				
			} else {
				//push 를 제외한 모든 명령어
			}
			
			
		}//for
		
		
	}
}




