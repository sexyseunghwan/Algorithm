package com.test.enc;

public class Main {
	public static void main(String[] args) {
		
		//암호화에는 문제없는듯 보이는데
		Input input = new Input();
		Exit exit = new Exit();//종료조건
		boolean loop = true;
		
		while(loop) {
			input.input();//처음 입력받는곳.
			
			int select = exit.selectExit();
			
			//종료하는 경우
			if (select == 1) loop = false;
		}
	}
}


/*



B D F B M 
G M M Z G 
B F M B X 
B B F P P 
 

 
(!finalArr[finalIndex].equals("P")) 
 
 
 XX!X#X*X@XX+X+X!X&XXX*X*X*XXXX@X#X*XXX+X!X&XPXX#X&X&XP
 
 * */
 