package com.test.dcy;

public class SecureKeyCheck {
	
	//keyWord에 같은 문자열이 들어있는지 판단해준다.
	public int keyCheck(String input) { 
		int result = 0;
		
		for (int i = 0; i < input.length(); i++) {
			
			String voca = input.substring(i,i+1);
			
			for (int j = i+1; j < input.length(); j++) {
				if(input.substring(j,j+1).equals(voca)) {
					result = 1;
					break;
				}
			}//for
		}//for
		
		return result;
	}
	
	
	public static void main(String[] args) {
		//확인해보는곳
		//String a = "apple";
		//SecureKeyCheck sc = new SecureKeyCheck();
		//sc.keyCheck("apple")
		
		//System.out.println(sc.keyCheck("aAe"));
		
	}
	
}
