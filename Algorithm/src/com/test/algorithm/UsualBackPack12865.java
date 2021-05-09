package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class UsualBackPack12865 {
	
	public static int[] weightArr;
	public static int[] valArr;
	public static int[][] matrix;
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputs = br.readLine().split(" ");
		
		int N = Integer.parseInt(inputs[0]);//물품의 수 
		int W = Integer.parseInt(inputs[1]);//버틸 수 있는 무게
		
		matrix = new int[N][W+1];  
		
		weightArr = new int[N];//무게들이 존재
		valArr = new int[N];//무게에 대응되는 value들 
		
		//아래에서 배열에 하나씩 대응시켜준다고 생각하면된다.
		for(int i = 0; i < N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			
			weightArr[i] = Integer.parseInt((String)stk.nextElement());
			valArr[i] = Integer.parseInt((String)stk.nextElement());	
		}
		
		bw.write(knapsack(N-1,W) + "");
		bw.close();
		br.close();
	
	}
	
	public static int knapsack(int N,int W) {
		
		if (N < 0) {
			return 0;
		}
		//탐색하지 않은 위치
		if (matrix[N][W] == 0) {
			
			
			if (W - weightArr[N] < 0) {
				matrix[N][W] = knapsack(N-1,W);
			}
			else {
				matrix[N][W] = Math.max(knapsack(N-1,W), knapsack(N-1,W-weightArr[N])+ valArr[N]);
			}
		}
		
		return matrix[N][W];	
	}
}
