package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GlobalWarming5212 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputs = br.readLine().split(" ");
		
		
		int row = Integer.parseInt(inputs[0]);//행
		int col = Integer.parseInt(inputs[1]);//열
		
		//행렬을 만들어야 한다? -> 가장자리 행렬을 하나씩 추가해준다.
		String[][] matrix = new String[row+2][col+2];
		String[][] answerMatrix = new String[row+2][col+2];
		
		//행렬에 바다표시 육지표시 표시를 해주기 -> 가장자리 표시를 위해서 행렬 하나씩 늘려준다.
		for (int i = 0; i < row + 2; i++) {
			for (int j = 0; j < col + 2; j++) {
				matrix[i][j] = ".";
				answerMatrix[i][j] = ".";
			}
		}
		
		//행렬 입력 받기
		for (int i = 1; i < row+1; i++) {
			String[] landSeas = br.readLine().split("");
			for (int j = 1; j < col+1; j++) {
				matrix[i][j] = landSeas[j-1];
			}
		}
		
		
		for (int i = 1; i < row + 1; i++) {
			for (int j = 1; j < col + 1; j++) {
				
				if (matrix[i][j].equals("X")) {
					int count = 0;//인접한곳에 바다가 몇개 있는지 카운트 해주려고 만들어준것이다.
					
					if (matrix[i-1][j].equals(".")) count++;
					if (matrix[i][j-1].equals(".")) count++;
					if (matrix[i+1][j].equals(".")) count++;
					if (matrix[i][j+1].equals(".")) count++;
					
					if (count >= 3) {
						answerMatrix[i][j] = ".";
					} else {
						answerMatrix[i][j] = "X";
					}
				}
			}
		}
		
		int rstart,rlast,cstars,clast = 0;
		
		for (int i = 1; i < row + 1; i++) {
			boolean flag = true;
			for (int j = 1; j < col + 1; j++) {
				if (answerMatrix[i][j].equals("X")) {
					flag = false;
					rstart = i;
					break;
				}
			}
			if (!flag) break;
		}
		
		
		System.out.println();
		for (int i = 0; i < row + 2; i++) {
			for (int j = 0; j < col + 2; j++) {
				System.out.print(answerMatrix[i][j]);
			}
			System.out.println();
		}
		
		

		
		
//		for (int i = 0; i < row; i++) {
//			String[] cordinates = br.readLine().split("");
//			
//			for (int j = 0; j < col; j++) {
//				matrix[i][j] = cordinates[j];
//			}
//		}
		
		
		
		
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
	}
}
