package com.test.algorithm;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
 
public class TestPage {
 
	
	public static void main(String[] args) {
		
		
		
		String email = "ssh9308@naver.com";
		
		StringTokenizer stk = new StringTokenizer(email,"@");
		String userId = stk.nextToken();
		String userAddress = stk.nextToken();
		
		System.out.println(userId);
		System.out.println(userAddress);
		
		
		
	}
}




