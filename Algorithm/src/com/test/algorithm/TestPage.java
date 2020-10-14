package com.test.algorithm;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TestPage {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
	
		int cycle = Integer.parseInt(br.readLine());//반복할 횟수
		
		List<Integer> list = new ArrayList<Integer>();//동적 배열 생성
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < cycle; i++) {
			
			int input = Integer.parseInt(br.readLine());//숫자입력
			
			if (input == 0) {
				//0을 입력한 경우
				
				if (list.size() == 0) {
					//배열 내에 숫자가 더이상 없는경우
					
					sb.append(0 + "\n");
				} else {
					//배열 내에 숫자가 있는 경우
					
					int min = 2147483647;
					
					for (int j = 0; j < list.size(); j++) {
						
						int num = list.get(j);
						
						
					}
					
					
				}
				
			} else {
				//0이 아닌 그냥 숫자를 입력한 경우
				
				
			}
			
		}
		
		
	}
}




