package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;

public class Coprime4355 {
	
	//소인수분해 메서드
	private static HashMap<Integer, Integer> factorization(int number) {
		
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 
		 while(number != 1) {
			 for (int i = 2; i <= number; i++) {
				 
				 if (number % i == 0) {
					 number /= i;
					 if (map.containsKey(i)) {
						 map.put(i,map.get(i) + 1);
					 } else {
						 map.put(i,1);
					 }
					 break;
				 }//if
			 }//for
		 }//while
		return map;
	}
	
	//오일러 퓌함수 메서드
	private static int eulerphi(int number) {
		
		int result = 1;
		
		HashMap<Integer, Integer> map = factorization(number);
		
		Iterator<Integer> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			int key = keys.next();
			

			int answer = (int)(Math.pow((double)key, map.get(key)) - Math.pow((double)key, map.get(key)-1));
			
			result *= answer;
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			
			int input = Integer.parseInt(br.readLine());//입력한 값
			
			if (input != 0) {
				//입력으로 0을 적지 않은 경우 -> 계속 입력 받는다.
				sb.append(eulerphi(input) + "\n");
				
			} else {
				//입력으로 0을 적어준 경우 -> 멈춰준다
				break;
			}
		
		}//while
		
		bw.write(sb + "");
		br.close();
		bw.close();
		
	}

}