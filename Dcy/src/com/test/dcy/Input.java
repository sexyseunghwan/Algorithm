package com.test.dcy;

import java.util.Scanner;


public class Input {
	public void input() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean inputFirstFlag = true;
		boolean inputSecondFlag = true;
		
		InputErrorCheck iec = new InputErrorCheck();
		
		while(inputFirstFlag) {
			
			System.out.print("복호화할 비밀번호를 적어주세요 : ");
			String inputPw = scan.nextLine();
			int errInt = iec.errorcheck(inputPw);
			
			if (errInt == 0) {
				inputFirstFlag = false;
			} else {
				System.out.println("** 문자는 영어소문자/대문자 특수문자만 입력 가능합니다. **");
				continue;
			}
			
			
			while(inputSecondFlag) {
				
				System.out.print("복호화키를 적어주세요(중복을 제외해주세요) : ");
				
				String inputKey = scan.nextLine();//암호키
				
				//여기서 암호키를 검사할것이다.
				SecureKeyCheck skc = new SecureKeyCheck();
				int resultKey = skc.keyCheck(inputKey);
				
				if (resultKey == 1) {
					//key 값이 중복된경우
					System.out.println("key의 값은 중복값을 지정할 수 없습니다.");
					
				} else if (resultKey == 2) {
					//아무것도 안넣은 경우 -> ArithmeticException이 발생한다.
					System.out.println("공백은 입력할 수 없습니다.");
					
				} else {
					//key 값이 이상이 없는 경우
					inputSecondFlag = false;
					
					//이제 여기서 시작해야한다. -> 암호화 작업 시작
					Dcy dcyMatrix = new Dcy();
					Dcystart dcystart = new Dcystart();
					RandomDcy rdd = new RandomDcy();
					//예외처리 구문
					try {
						
						int passOrFail = rdd.checkDcyWord(inputPw);//0 이면 pass 1 이면 fail
						String decodeVoca = "";//돌려줄 복호화문
						
						if (passOrFail == 0) {
							
							decodeVoca = dcystart.returnDcyCode(dcyMatrix.initialMatrix(), inputPw, inputKey);//오류발생
							
						} else {
							//여기서 이제 이상한 문자열을 돌려줄것이다.
							decodeVoca = rdd.strangeWord();
						}
						
						System.out.printf("복호화된 문자열 : %s\n",decodeVoca);
						
					} catch(Exception e) {
						System.out.println("문자열을 복호화하는데에 오류가 발생했습니다.");
						e.printStackTrace();
					}	
				}
			}//while
		}//while
		
	}
}
