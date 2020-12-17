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
	
	static void arrPrint(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	//복호화 메트릭스,암호화한 문자열, 복호화키
	public String returnDcyCode(String[][] dcyMatrix, String input, String pwKey) {
		
		String[] inputList = input.split("");//복호화 한 값이 들어간다. => MBBAMVMGGZ
		
		String[] decKeySplitArrOrigin = pwKey.split("");//origin -> 정렬안해준 배열.
		String[] decKeySplitArr = pwKey.split("");//comparison -> 정렬해주는 배열.
		
		Arrays.sort(decKeySplitArr);//정렬 -> s e c u r -> c e r s u 로 변환
		
		int stepOneRow = inputList.length / pwKey.length();// 2차 암호화때 도출된 매트릭스 행의 개수
		int stepOneCol = pwKey.length();// 2차 암호화때 도출된 매트릭스 열의 개수
		
		String[][] stepOneMatrix = new String[stepOneRow][stepOneCol];
		
		int inputListIndex = 0;//inputList 의 index
		
		
		for (int i = 0; i < decKeySplitArr.length; i++) {
			
			String selectVoca = decKeySplitArr[i];//선택된 하나의 단어 -> 처음은 c일것이다.
			
			for (int j = 0; j < decKeySplitArrOrigin.length; j++) {//원조의 단어 split 한것과 비교를 해준다.
				
				if (selectVoca.equals(decKeySplitArrOrigin[j])) { // c e r s u -> s e c u r
					
					for (int k = 0; k < stepOneRow; k++) {
						
						stepOneMatrix[k][j] = inputList[inputListIndex++];
					}
					
					break;
				}
			}
		}//for
		
		//arrPrint(stepOneMatrix);//여기까지도 이상은 안보인다.
		
		String[] finalArr = new String[stepOneRow*stepOneCol];//마지막 결과배열.
		int finalArrIndex = 0;
		
		for (int i = 0; i < stepOneRow; i++) {
			for (int j = 0; j < stepOneCol; j++) {
				finalArr[finalArrIndex++] = stepOneMatrix[i][j];
			}
		}// { B D F B M G M M Z G B F M B X B B F P P } 형식이 될것이다.
		//    B D F B M G M M Z G B F M B X B B F P P  -> 문제없고
		//System.out.println();
		//arrPrint(finalArr);
		
		String answerVal = "";//최종 복호화 답
		int finalIndex = 0;
		int swich = 1;
		String finalRow = "";
		String finalCol = "";
		
		Dcy dcy = new Dcy();
		String[] resultVoca = dcy.zeroRowPw;
		//System.out.println(finalArr.length);
		
		while(finalIndex < finalArr.length) {
			
			if (finalArr[finalIndex].equals("P")) {
				break;
			} else {
				//System.out.println(finalIndex);
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
			}
		}//while
		
		//System.out.println("합격");
		return answerVal;
	}
	
	public static void main(String[] args) {
		//Dcy d = new Dcy();
		
		//여기서 확인좀
		//Dcystart dcy = new Dcystart();
		//MBBAMVMGGZ
		//dcy.returnDcyCode(d.initialMatrix(),"FMMFDMFBMGXPBGBBBZBP","secur");
		//dcy.returnDcyCode(d.initialMatrix(),"MBBAMVMGGZ","secur");
		
	}
}
