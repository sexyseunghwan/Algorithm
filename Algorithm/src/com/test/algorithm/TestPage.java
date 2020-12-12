package com.test.algorithm;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class TestPage {
	
	
	static int test(int params) {
		
		params++;
		
		return params; 
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		
//		System.out.println(test(3));
//		
//		
//		//여기서 연습을 해보자
//		String[] inputs = br.readLine().split(" ");
//		
//		int r = Integer.parseInt(inputs[0]);
//		int c = Integer.parseInt(inputs[1]);
//		
//		String[][] matrix = new String[r+2][c+2];
		
		
		//String a = "apple";
		//System.out.println(a.substring(1,2));
		
		
//		String[] array = new String[4];
//		array[0] = "a";
//		array[1] = "z";
//		array[2] = "c";
//		array[3] = "b";
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.println(array[i]);
//		}
//		
//		
//		System.out.println("=============");
//		Arrays.sort(array);
//		
//		//System.out.println(array.toString());
//		for (int i = 0; i < 4; i++) {
//			System.out.println(array[i]);
//		}
//		
		
		
		//String a = "**";
		//String b = "\\";
		
		
//		String a = br.readLine();
//		System.out.println(a.equals("\\"));
//		
		
//		Scanner scan = new Scanner(System.in);
//		String inputPw = scan.nextLine();
//		System.out.println(inputPw);
		
		
		//String[] a = {"A"};
		//String[] b = {"a"};
		//String c = b[0];
		
		String a =  "apple";
		String b = "Apple";
		
		System.out.println(a.substring(0,1).equals(b.substring(0,1)));
		
		
		//System.out.println(c.equals(a[0]));
		
		
//		for (int i = 0; i < 2; i++) {
//			System.out.println("asd");
//		}
		
		
		
		
//		String[] arr = {"A","v","a","B","b"};
//		
//		Arrays.sort(arr);
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	
		//imposible
		
		
		/*
		      A D F G V X S B M G 
            A K Z W R 1 F < l c ** 
            D 9 B 6 C L 5 . x & ** 
            F Q 7 J P G X > m * ** 
            G E V Y 3 A N / v z ** 
            V 8 O D H 0 2 ? ' ( ** 
            X U 4 I S T M ^ n _ ** 
            S ~ ` ! @ # $ % b k ** 
            B q i t d : = " j h ** 
            M f ) ; p g s , a o ** 
            G u + y r e w - \ |  
		 
		 
		 
		 
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
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




