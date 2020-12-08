package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ADFGVX {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[][] initialMatrix = new String[7][7];
		String[] standard = {"A","D","F","G","V","X"};
		String[] innerContents = {"K","Z","W","R","1","F","9","B","6","C","L","5",
									"Q","7","J","P","G","X","E","V","Y","3","A","N",
									"8","O","D","H","0","2","U","4","I","S","T","M"};
		
		for (int i = 1; i <= standard.length; i++) {
			initialMatrix[0][i] = standard[i-1]; 
			initialMatrix[i][0] = standard[i-1]; 
		}
		
		int shift = 0;
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				initialMatrix[i][j] = innerContents[shift++];
			}
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(initialMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//System.out.println(innerContents.length);//확인용
		
		String input = br.readLine();//input
		
		
		
		
	}

}
