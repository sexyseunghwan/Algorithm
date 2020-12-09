package com.test.algorithm;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class TestPage {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//여기서 연습을 해보자
		String[] inputs = br.readLine().split(" ");
		
		int r = Integer.parseInt(inputs[0]);
		int c = Integer.parseInt(inputs[1]);
		
		String[][] matrix = new String[r+2][c+2];
		
		
		
		
		
		
		
		/*
	
	
	# # . .
	. # # .
	# . . .
	
	# . . .
	. # # .
	# # . .
	
	XXXXXX
	X...XX
	.....X
	X.X.XX
	XXXXXX
	
	재귀 함수를 써야 될거같은 느낌이 확 드는데 아닌가뵹/ㅁ
	
	
	XXXXXX
	XXXXXX
	XXXXXX
	XXXXXX
	XXXXXX
	
		 * */
		
		
		/*
		 	............
		 	............
		 	...XXX.XXX..
			.XXX........
			............
		 
		 
		 	............
			............
			...XX...X...
			..XX........
			............
		 	
		 	row -> 2 ~ 3
		 	col -> 2 ~ 8
		 	
		 	컬럼쪽이 뭔가 잘못된 알고리즘을 쓰고 있다 이말이지
		 	
		 	
4 10
..........
..XXX.XXX.
XXX.......
..XXX.XXX.
			
			
			.XX...X
			XX.....
			.XX...X

		 	.XX...X
			XX.....
			.XX...X
		 	
		 	
		 	5 5
		 	.....
		 	....X
		 	X...X
		 	X..X.
		 	..X..

서로 같다는걸 볼수있지?!
............
............
...XX...X...
..XX........
...XX...X...
............
		 	
............
............
...XX...X...
..XX........
...XX...X...
............		 	
		 	
		 	
		 
		  */

	}
}




