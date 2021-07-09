package com.test.enc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encstart {
	
	//확인용 메서드
	static void arrPrint(List<String> arr) {
		
		System.out.println(arr);
		
	}
	//애가 뭐하는 역할이지?
	public String naturalPrint(List<String> arr) {
		
		String answer = "";
		
		for (int i = 0; i < arr.size(); i++) {
			answer += arr.get(i);
		}
		
		
		return answer;
	}
	
	
	//본격적으로 암호화 시작
	//암호화매트릭스 , 암호화할단어, 암호key값
	public String returnEncVoca(String[][] encMatrix, String input, String pwKey) {
		
		List<String> result = new ArrayList<String>();
		
		//암호변환작업 1 -> encoding
		for (int i = 0; i < input.length(); i++) {
			
			String str = input.substring(i,i+1);
			
			for (int j = 1; j < 11; j++) {
				for (int k = 1; k < 11; k++) {
					
					if (str.equals(encMatrix[j][k])) {
						result.add(encMatrix[j][0]);
						result.add(encMatrix[0][k]);
					}
				}
			}//for
		}//for -> 1차 암호화 완료
		
		//2차 암호화
		int keyRow = (int)Math.ceil((double)result.size() / pwKey.length());//다운캐스팅 까지 완료 -> 올림을 통하여 행을 하나 늘려주는 역할을 수행한다.
		int keyCol = pwKey.length();//key의 길이
		
		String[][] keyMatrix = new String[keyRow+1][keyCol]; //2차 암호화된 결과를 담을 그릇 왜 플러스1을 해주는거지? -> key를 타이틀로 주기 위해서
		
		int keyIndex = 0;
		
		for (int i = 0; i < keyRow + 1; i++) {
			for (int j = 0; j < keyCol; j++) {
				
				if (i == 0) { //첫번째 줄일경우
					
					keyMatrix[i][j] = pwKey.substring(j,j+1);//위의 문자 키워드를 집어넣을 것이다. -> key 값을 적겠다는 의미가 된다.
					
				} else { // 두번째 줄 이상일 경우
					
					if (keyIndex < result.size()) {
						keyMatrix[i][j] = result.get(keyIndex++);
					} else {
						keyMatrix[i][j] = "P";
					}
				}
			}
		}//for
		
		List<String> finalArr = new ArrayList<String>();//최종 암호화된 문자열을 집어넣을 곳이 된다.
		String[] keySort = pwKey.split("");//입력key를 부분부분 쪼갠다.
		Arrays.sort(keySort);//키 정렬 -> 우선순위를 배정하기 위함이다.
		
		
		for (int i = 0; i < keySort.length; i++) {
			
			String selectNum = keySort[i];//key 문자열 하나.
			
			for (int j = 0; j < keyCol; j++) {
				
				if (selectNum.equals(keyMatrix[0][j])) {
					
					
					for (int k = 1; k <= keyRow; k++) {
						
						finalArr.add(keyMatrix[k][j]);
						
					}
					
					break;
				}
			}	
		}//for
		
		return naturalPrint(finalArr);
	}
	
	
	
	public static void main(String[] args) {
		//테스트용
		Enc enc = new Enc();
		Encstart es = new Encstart();
		System.out.println(es.returnEncVoca(enc.initialMatrix(),"important","secur"));
	}
	
}
