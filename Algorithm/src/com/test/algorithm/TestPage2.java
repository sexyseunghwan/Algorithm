package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestPage2 {
 
    public static void main(String[] args) throws IOException {
 
      
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int answer = 0;
		
		while(input > 0) {
			
			if (input % 2 == 1) answer++;
			
			input /= 2;
			
		}
		
		
		bw.write(answer + "");
		br.close();
		bw.close();
    	 
    }
}