package com.test.algorithm;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class TestPage {
	
	
	static int test(int params) {
		
		params++;
		
		return params; 
	}
	
	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		System.out.println(test(3));
		
		
		
		
		/*
		  
		  1 1 0 1 1
          0 1 1 0 0
          0 0 0 0 0
          1 1 0 1 1
          1 0 1 1 1
          1 0 1 1 1
          
          area = 1
          
		  * 1 0 1 1
          0 1 1 0 0
          0 0 0 0 0
          1 1 0 1 1
          1 0 1 1 1
          1 0 1 1 1
          
          area = 2
          
          * * 0 1 1
          0 1 1 0 0
          0 0 0 0 0
          1 1 0 1 1
          1 0 1 1 1
          1 0 1 1 1
          
          area = 4
          
          * * 0 1 1
          0 * * 0 0
          0 0 0 0 0
          1 1 0 1 1
          1 0 1 1 1
          1 0 1 1 1
          
          this is dfs ;;;이야 쩐다 진짜 미치겠다 ㅋㅋㅋ 미쳤다 진짜 ㅋㅋㅋ 어찌 이런생각을 할수가 있을까 ㅋㅋㅋ 미치겠다.
          
          <- , -> , up , down
		  
		 	
		  
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




