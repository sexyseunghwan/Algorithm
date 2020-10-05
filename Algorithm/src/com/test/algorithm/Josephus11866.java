package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Josephus11866 {
	
	/*
	 문제
	요세푸스 문제는 다음과 같다.
	
	1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
	이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
	이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
	예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
	
	N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
	
	출력
	예제와 같이 요세푸스 순열을 출력한다.
	
	예제 입력 1 
	7 3
	
	예제 출력 1 
	<3, 6, 2, 7, 5, 1, 4> 
	 
	 */
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");//입력받기
		
		int n = Integer.parseInt(input[0]);//N명의 사람이 존재
		int k = Integer.parseInt(input[1]);//K번쨰 요세푸스 순열
		
		int[] numArr = new int[n];//처음 수열 준비 1 ~ 지정한 숫자까지의 array를 만들것이다.
		
		for (int i = 0; i < n; i++) {
			numArr[i] = i+1;
		}
		
		int totalCount = 0;
		int count = 0;
		int index = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		
		while(totalCount != n) {
			
			index %= n;
			
			if (numArr[index] != 0) {
				count++;
			}
			
			if (count == k) {
				
				if (totalCount == n - 1) {
					sb.append(numArr[index] + ">");
				} else {
					sb.append(numArr[index] + ", ");
				}
				
				numArr[index] = 0;
				totalCount++;
				count = 0;
			}
			
			index++;
		}//while
		
		
		bw.write(sb + "");
		br.close();
		bw.close();
	}
}
