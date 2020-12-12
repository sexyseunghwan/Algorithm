package com.test.dcy;

import java.util.Arrays;

public class Dcystart {
	
	//확인용 메서드
	static void arrPrint(String[][] arr) {
		
		int rows = arr.length;
		int col = arr[0].length;
		
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public String returnDcyCode(String[][] dcyMatrix, String input, String pwKey) {
		
		String[] inputList = input.split("");//복호화 한 값이 들어간다.
		
		String[] decKeySplitArrOrigin = pwKey.split("");//origin
		String[] decKeySplitArr = pwKey.split("");//comparison
		
		Arrays.sort(decKeySplitArr);//정렬 -> s e c u r -> c e r s u 로 변환
		
		int stepOneRow = inputList.length / pwKey.length();// 2차 암호화때 도출된 매트릭스 행의 개수
		int stepOneCol = pwKey.length();// 2차 암호화때 도출된 매트릭스 열의 개수
		
		String[][] stepOneMatrix = new String[stepOneRow][stepOneCol];
		
		int inputListIndex = 0;//inputList 의 index
		
		
		for (int i = 0; i < decKeySplitArr.length; i++) {
			
			String selectVoca = decKeySplitArr[i];//선택된 하나의 단어 -> 처음은 c일것이다.
			
			for (int j = 0; j < decKeySplitArrOrigin.length; j++) {//원조의 단어 split 한것과 비교를 해준다.
				
				if (selectVoca.equals(decKeySplitArrOrigin[j])) {
					
					for (int k = 0; k < stepOneRow; k++) {
						
						stepOneMatrix[k][j] = inputList[inputListIndex++];
					}
					
					break;
				}
			}
		}//for
		
		
		String[] finalArr = new String[stepOneRow*stepOneCol];//마지막 결과배열.
		int finalArrIndex = 0;
		
		for (int i = 0; i < stepOneRow; i++) {
			for (int j = 0; j < stepOneCol; j++) {
				finalArr[finalArrIndex++] = stepOneMatrix[i][j];
			}
		}
		
		String answerVal = "";//최종 복호화 답
		int finalIndex = 0;
		int swich = 1;
		String finalRow = "";
		String finalCol = "";
		
		Dcy dcy = new Dcy();
		String[] resultVoca = dcy.zeroRowPw;
		
		while(!finalArr[finalIndex].equals("P")) {
			System.out.println("?");
			swich *= -1;
			
			if (swich == 1) {
				finalCol = finalArr[finalIndex++];
				int row = 0;
				int col = 0;
				
				//여기서부터 탐색에 들어가야 한다. -> 나중에 업글을 시켜보자. -> 성능 튜닝.
				for (int i = 0; i < resultVoca.length; i++) {
					if (finalRow.equals(resultVoca[i])) {
						row = i+1;
						break;
					}
				}
				
				for (int i = 0; i < resultVoca.length; i++) {
					if (finalCol.equals(resultVoca[i])) {
						col = i+1;
						break;
					}
				}
				answerVal += dcyMatrix[row][col];
				
			} else {
				finalRow = finalArr[finalIndex++];
			}
		}//while
		
		
		return answerVal;
	}
	
}
