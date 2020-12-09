package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ADFGVX {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[][] initialMatrix = new String[7][7];//여기에 암호들이 들어있음.
		String[] standard = {"A","D","F","G","V","X"};
		String[] innerContents = {"K","Z","W","R","1","F","9","B","6","C","L","5",
									"Q","7","J","P","G","X","E","V","Y","3","A","N",
									"8","O","D","H","0","2","U","4","I","S","T","M"};
		
		for (int i = 1; i <= standard.length; i++) {
			initialMatrix[0][i] = standard[i-1]; 
			initialMatrix[i][0] = standard[i-1]; 
		}
		
		int shift = 0;
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				initialMatrix[i][j] = innerContents[shift++];
			}
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(initialMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//System.out.println(innerContents.length);//확인용
		String input = br.readLine();//input
		List<String> result = new ArrayList<String>();
		
		
		//암호변환작업 1 -> encoding
		for (int i = 0; i < input.length(); i++) {
			
			String str = input.substring(i,i+1);
			
			for (int j = 1; j < 7; j++) {
				for (int k = 1; k < 7; k++) {
					
					if (str.equals(initialMatrix[j][k])) {
						result.add(initialMatrix[j][0]);
						result.add(initialMatrix[0][k]);
					}
				}
			}//for
		}//for
		
		//일단 후처리는 뒤에 맡겨두고 ㅇㅇ -> 제 2 암호화를 준비한다.
		String inputKey = br.readLine();
		int keyRow = (int)Math.ceil(result.size() / inputKey.length());//다운캐스팅 까지 완료
		int keyCol = inputKey.length();
		
		String[][] keyMatrix = new String[keyRow+1][keyCol]; 
		
		int keyIndex = 0;
		
		for (int i = 0; i <= keyRow; i++) {
			for (int j = 0; j < keyCol; j++) {
				
				if (i == 0) { // 첫번째 줄일경우
					
					keyMatrix[i][j] = inputKey.substring(j,j+1);//위의 문자 키워드를 집어넣을 것이다.
					
				} else { // 두번째 줄 이상일 경우
					
					if (keyIndex < result.size()) {
						keyMatrix[i][j] = result.get(keyIndex++);
					} else {
						keyMatrix[i][j] = "P";
					}
				}
			}
		}//for
		
		
		String[] finalArr = new String[keyRow*keyCol];
		String[] keySort = inputKey.split("");
		Arrays.sort(keySort);//키 정렬 
		
		
		for (int i = 0; i < keySort.length; i++) {
			
			for (int j = 0; j < ; j++) {
				
			}
		}
		
		
		//잘 들어가지는걸 확인했다.
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i));
//		}
		
		
		
		
		
	}

}
