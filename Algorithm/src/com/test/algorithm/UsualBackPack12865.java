package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class UsualBackPack12865 {
	
	public static int[] weightArr;
	public static int[] valArr;
	public static Integer[][] matrix;
	//wpqkf
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputs = br.readLine().split(" ");
		
		int N = Integer.parseInt(inputs[0]);//물품의 수 
		int W = Integer.parseInt(inputs[1]);//버틸 수 있는 무게
		
		matrix = new Integer[N+1][W+1];  
		
		weightArr = new int[N+1];//무게들이 존재
		valArr = new int[N+1];//무게에 대응되는 value들 --> 왜 안되는 걸까 고민을 해보자 인간아 ㅋㅋㅋ
		
		weightArr[0] = 0;
		valArr[0] = 0;
		
		//아래에서 배열에 하나씩 대응시켜준다고 생각하면된다.
		for(int i = 1; i <= N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			
			weightArr[i] = Integer.parseInt((String)stk.nextElement());
			valArr[i] = Integer.parseInt((String)stk.nextElement());	
		}
		
		//System.out.println(knapsack(N,W));
		
		for (int i = 0; i < N+1; i++) matrix[i][0] = 0;
		for (int i = 0; i < W+1; i++) matrix[0][i] = 0;
		
		//System.out.println(matrix[0][7]);
		
		System.out.println(knapsack(N,W));
		
		
//		for (int i = 0; i < valArr.length; i++) {
//			System.out.println(valArr[i]);
//		}
		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < W + 1; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}
		
		
	}
	
	
	public static int knapsack(int N,int W) {
		
		
		if (N <= 0) {
			System.out.println("+++++++++");
			System.out.println("N : " + N);
			System.out.println("W : " + W);
			System.out.println("+++++++++");
			
			System.out.println("asd"); return 0;
			
		}
		//추가로 못 담는다는게 무슨말이지?
		//탐색하지 않은 위치
		if (matrix[N][W] == null) {
			
			System.out.println("+++++++++");
			System.out.println("N : " + N);
			System.out.println("W : " + W);
			System.out.println("+++++++++");
			
			
			
			
			if (weightArr[N] > W) {
				System.out.println("s1");
				matrix[N][W] = knapsack(N-1,W);
			}
			//else {
				System.out.println("s2");
				matrix[N][W] = Math.max(knapsack(N-1,W), knapsack(N-1,W-weightArr[N])+ valArr[N]);
			//}
			//System.out.println(matrix[N][W]);
			System.out.println("out");
		}
		
		return matrix[N][W];
		
		//int val1 = knapsack(N-1,W-weightArr[N]+ valArr[N]);
		//int val2 = knapsack(N-1,W);
		
		
	}
	
	
}
