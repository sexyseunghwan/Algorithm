package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculateDayDiff1476 {
	
		public static void main(String[] args) throws Exception {
			
			Scanner scan = new Scanner(System.in);
			
			int e=1,m=1,s=1;
			
			StringTokenizer stk = new StringTokenizer(scan.nextLine()," ");
			
			int E = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			int S = Integer.parseInt(stk.nextToken());
			
			int year = 1;
			
			while(true) {
				
//				if (E) {
//					System.out.print(year);
//				}
				
				e++;
				m++;
				s++;
				
				
				
			}
			
			
			
			
			
		}
		//두번째 풀이
		private static void m2() {
			
			
			
		}

		//첫번째 풀이
		private static void m1() throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer stk = new StringTokenizer(br.readLine()," ");
			
			int e=1,s=1,m=1;
			
			int newE = Integer.parseInt(stk.nextToken());
			int newS = Integer.parseInt(stk.nextToken());
			int newM = Integer.parseInt(stk.nextToken());
			
			int year = 1;
			
			while(true) {
				
				if(e == newE && s == newS && m == newM) {
					
					bw.write(year + "");
					break;
				}
				
				e++;
				s++;
				m++;
				year++;
				
				
				if (e == 16) e = 1;
				if (s == 29) s = 1;
				if (m == 20) m = 1;

				
			}//while
			
			
			bw.close();
			br.close();
			
		}

}
