package com.test.dcy;

import java.util.Random;

public class RandomDcy {
	
	
	//입력된 문자에 null이 포함된 경우 -> 이걸쓰는게 아닌거 같네 
	public int dcyReturnRand(String input) {
		
		int flag = 0;//0일경우 null이 포함되지 않았다는 의미가 된다.
		
		for (int i = 0; i < input.length(); i++) {
			
			//리턴된 문자열에 null이 포함되어 있다면 일단 완전히 틀린것이므로 
			if (input.substring(i,i+1)==null) {
				flag = 1;//1일경우 null이 포함되었다는 의미가 된다.
				break;	
			}
			
		}
		return flag;
	}
	
	//입력된 문자에 null이 포함된 경우에는 작위적인 문자열을 돌려줄 것이다.
	public String randomStringOutput() {
		
		Random rnd = new Random();
		int stringSize = rnd.nextInt(30) + 3;//작위적인 문자열의 크기
		
		String resultString = "";
		Dcy dcy = new Dcy();
		String[] innerContents = dcy.innerContents;//암호화키판
		
		
		for (int i = 0; i < stringSize; i++) {
			
			resultString += innerContents[rnd.nextInt(innerContents.length)];
			
		}
		
		return resultString;
		
	}
	
	
	public static void main(String[] args) {
		//확인용
//		Random rnd = new Random();
//		for (int i = 0; i < 200; i++) {
//			System.out.println(1 + rnd.nextInt(10));
//				
//		}
		
	}
	
}
