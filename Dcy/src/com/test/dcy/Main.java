package com.test.dcy;


//복호화
public class Main {
	public static void main(String[] args) {
		
		Input input = new Input();
		Exit exit = new Exit();
		boolean loop = true;
		
		while(loop) {
			input.input();//처음 입력 받는곳
			
			int select = exit.selectExit();
			//종료하는 경우
			if (select == 1) loop = false;
			
		}//while
	}
}

//복호화값이 null이 하나라도 나오는경우에는 아무런 문자를 넣어주는걸로 하자



/* 	
      A D F G V X S B M Z 
	A K Z W R 1 F < l c ** 
	D 9 B 6 C L 5 . x & ** 
	F Q 7 J P G X > m * ** 
	G E V Y 3 A N / v z ** 
	V 8 O D H 0 2 ? ' ( ** 
	X U 4 I S T M ^ n _ ** 
	S ~ ` ! @ # $ % b k ** 
	B q i t d : = " j h ** 
	M f ) ; p g s , a o ** 
	Z u + y r e w - \ |   
	
	
	
 * */


