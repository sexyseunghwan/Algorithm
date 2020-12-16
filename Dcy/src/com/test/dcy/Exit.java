package com.test.dcy;

import java.util.Scanner;


public class Exit {
	
	Scanner scan = new Scanner(System.in);
	PrettyCoding pc = new PrettyCoding();
	
	public int selectExit() {
		
		boolean flag = true;
		int result = 0;
		
		while(flag) {
			pc.splitVisual(50);
			System.out.print("계속 복호화 하시려면 1번 종료하시려면 0번을 눌러주세요 : ");
			String input = scan.nextLine();
			pc.splitVisual(50);
			
			if (input.equals("1")) {
				flag = false;
			} else if (input.equals("0")) {
				System.out.println("종료합니다. 아무키나 누르면 종료됩니다.");
				result = 1;
				flag = false;
				scan.nextLine();
			} else {
				pc.splitVisual(50);
				System.out.println("잘못 입력 하셨습니다.");
				pc.splitVisual(50);
			}
		}//while

		
		return result;
	}
	
}
