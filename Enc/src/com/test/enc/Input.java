package com.test.enc;

import java.util.Scanner;

public class Input {

	
	public void input() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean inputFirstFlag = true;
		boolean inputSecondFlag = true;
		
		
		while(inputFirstFlag) {
			
			System.out.print("암호화할 비밀번호를 적어주세요 : ");
			
			String inputPw = scan.nextLine();//오류처리는 일단 제외해보자.
			inputFirstFlag = false;//여기서는 일단 오류처리 제외할것이다.
			
			while(inputSecondFlag) {
				
				System.out.print("암호키를 적어주세요(중복을 제외해주세요) : ");
				
				String inputKey = scan.nextLine();//암호키
				
				//여기서 암호키를 검사할것이다.
				SecureKeyCheck skc = new SecureKeyCheck();
				int resultKey = skc.keyCheck(inputKey);
				
				if (resultKey == 1) {
					//key 값이 중복된경우
					System.out.println("key의 값은 중복값을 지정할 수 없습니다.");
				} else {
					//key 값이 이상이 없는 경우
					inputSecondFlag = false;
					
					//이제 여기서 시작해야한다. -> 암호화 작업 시작
					Enc encMatrix = new Enc();
					Encstart encstart = new Encstart();
					
					//예외처리 구문
					try {
						
						String encodeVoca = encstart.returnEncVoca(encMatrix.initialMatrix(), inputPw, inputKey);
						
						System.out.printf("암호화된 문자열 : %s",encodeVoca);
						System.out.println();
						
					} catch(Exception e) {
						System.out.println("문자열을 암호화하는데에 오류가 발생했습니다.");
						e.printStackTrace();
					}
					
					
				}
				
				
			}//while
		}//while
		
	}
	
}
