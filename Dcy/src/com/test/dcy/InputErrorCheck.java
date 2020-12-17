package com.test.dcy;

public class InputErrorCheck {
	
	//들어오는 문자열 체크해준다. -> 들어오면 안되는 문자열 체크 한번 해주는 역할이다.
	public int errorcheck(String input) {
		
		Dcy dcy = new Dcy();
		String[] innerContents = dcy.innerContents;//암호화판 가져온다.
		
		int result = 0;
		
		for (int i = 0; i < input.length(); i++) {
			
			String str = input.substring(i,i+1);
			boolean flag = false;//같은문자열이 나오면 true 로 바뀔것이다.
			
			//문자열 대조
			for (int j = 0; j < innerContents.length; j++) {
				//같은 문자열이 나오면 멈춰준다.
				if (str.equals(innerContents[j])) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				result = 1;
				break;
			}	
		}//for
		
		return result;
	}
}

