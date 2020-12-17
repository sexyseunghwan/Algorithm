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

// "@","&","#","!","+","*","x","$","?","X"

/* 	
      @ & # ! + * x $ ? X 
	@ K Z W R 1 F < l c ** 
	& 9 B 6 C L 5 . x & ** 
	# Q 7 J P G X > m * ** 
	! E V Y 3 A N / v z ** 
	+ 8 O D H 0 2 ? ' ( ** 
	* U 4 I S T M ^ n _ ] 
	x ~ ` ! @ # $ % b k [ 
	$ q i t d : = " j h } 
	? f ) ; p g s , a o { 
	X u + y r e w - \ |
	
	전혀 알 수 없는 알고리즘으로 향하는데?!;;;   	
	key 가 아닌값들은 이상하게 돌려주면 되는거 아냐? 맞지 그냥 null 사태를 안만들면 되는거네?!   	
*/


