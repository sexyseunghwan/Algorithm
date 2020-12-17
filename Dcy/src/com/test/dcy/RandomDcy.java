package com.test.dcy;

import java.util.Random;

public class RandomDcy {
	
	
	//입력된 문자에 null이 포함된 경우 -> 이걸쓰는게 아닌거 같네 
//	public int dcyReturnRand(String input) {
//		
//		int flag = 0;//0일경우 null이 포함되지 않았다는 의미가 된다.
//		
//		for (int i = 0; i < input.length(); i++) {
//			
//			//리턴된 문자열에 null이 포함되어 있다면 일단 완전히 틀린것이므로 
//			if (input.substring(i,i+1)==null) {
//				flag = 1;//1일경우 null이 포함되었다는 의미가 된다.
//				break;	
//			}
//			
//		}
//		return flag;
//	}
	
	//합당한 복호화문자열을 적었는지 판단해줄것이다.
	public int checkDcyWord(String word) {
		
		Dcy dcy = new Dcy();
		String[] standard = dcy.zeroRowPwError;//모든암호는 이 안에서 해결된다. 이 이외의 문자가 나오면 이상한 답을 돌려줄것이다.
		int answer = 0;
		
		//boolean flag = true;//복호화입력을 잘 했는지 아닌지 판단하는 도구가 된다. true 면 넘어가고 false 면 이상한 답을 돌려줄 것이다.
		
		for (int i = 0; i < word.length(); i++) {
			
			String str = word.substring(i,i+1);
			
			boolean checkPass = false;
			
			for (int j = 0; j < standard.length; j++) {
				//입력한 문자열중 하나가 복호화에 있어야하는 문자와 같은지 체크 
				if (str.equals(standard[j])) {
					checkPass = true;
					break;
				}
			}//for
			
			//들어오면 안되는 문자열이 들어온 경우
			if (!checkPass) {
				answer = 1;
				break;
			}
		}//for
		
		return answer;
	}

	
	// 문제가 있는 복호화문에 대해서 요상스런 문자열을 돌려줄 것이다.
	public String strangeWord() {
		
		Dcy dcy = new Dcy();
		String[] innerContents = dcy.innerContents;
		
		Random rnd = new Random();
		int stringSize = rnd.nextInt(30) + 5;//작위적인 문자열의 크기
		String resultString = "";
		
		for (int i = 0; i < stringSize; i++) {
			
			resultString += innerContents[rnd.nextInt(innerContents.length)];
			
		}
		
		return resultString;
	}
	
	public static void main(String[] args) {
		//확인용
		Random rnd = new Random();
		for (int i = 0; i < 200; i++) {
			System.out.println(1 + rnd.nextInt(10));
				
		}
		
	}
	
}
