package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestPage {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");//입력받기
		
		int n = Integer.parseInt(input[0]);//N명의 사람이 존재
		int k = Integer.parseInt(input[1]);//K번쨰 요세푸스 순열
		
		int[] numArr = new int[n+1];//처음 수열 준비 1 ~ 지정한 숫자까지의 array를 만들것이다.
		
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		
		int count = 0;//카운트 해줄것
		int realNum = 1;
		
		for (int i = 1; i <= n; i++) {
			
			count = 0;
			
			while (true) {
				
				if (numArr[realNum] == 0) count++;
				
				if (count == k) {
					numArr[realNum] = 1;//수열에 1로 지정하면 지워졌다는 뜻이 된다.
					
					if (i == n) sb.append(realNum + ">"); 
					else sb.append(realNum + ", ");
					
					break;
				}
				
				realNum++;
				
				if (realNum > n) realNum %= n;
			}//while
			
		}//for
		
		
		bw.write(sb + "");
		br.close();
		bw.close();
		
		
	}
}




