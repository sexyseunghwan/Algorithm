package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Coprime4355 {
	public static void main(String[] args) throws Exception{
		
		//1은 모든수와 서로소이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer sb = new StringBuffer();
		
		
		while(true) {
			
			int input = Integer.parseInt(br.readLine());//입력한 값
			int count = 1;
			int flag = 0;
			
			if (input != 0) {
				
				for (int i = 2; i < input; i++) {
					
					for (int j = 2; j <= i; j++) {
						
						if (input % j == 0 && i % j == 0) {
							flag = 1;
							break;
						} 
						
					}//for2
					
					if (flag == 1) {
						break;
					} else {
						count++;
					}
					
				}//for1  수정?!
				
				sb.append(count + "\n");
				
			} else {
				//0 을 적으면 멈춰준다.
				break;
			}
		}
		
		bw.write(sb + "");
		br.close();
		bw.close();
		
	}

}
