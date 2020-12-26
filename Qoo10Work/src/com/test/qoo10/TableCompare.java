package com.test.qoo10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TableCompare {
	
	// 스테이징에 존재하는 테이블의 정보를 빼오는것
	public List<String[]> getStaging() throws Exception{
		
		BufferedReader readerStaging = new BufferedReader(new FileReader("C:\\test\\app.txt"));
		
		String line = null;
		
		List<String[]> staging = new ArrayList<String[]>();
		
		while((line = readerStaging.readLine()) != null) {
			
			String[] inputs = new String[4];//이름,형,크기,null 유무
			
			String voca = "";//단어
			int index = 0;//인덱스
			
			for (int i = 0; i < line.length(); i++) {
				
				String word = line.substring(i,i+1);
				
				if (i == line.length()-1) {
					voca += word;
					inputs[index] = voca;
				} else {
					//마지막 단어가 아닐 경우에
					if (!word.matches("^[a-zA-Z0-9]$") && (!word.equals("_")) && (!word.equals("-"))) {
						
						if (voca.equals("")) {
							
						} else {
							inputs[index] = voca;
							index++;
						}
						
						voca = "";
					} else {
						voca += word;
					}
				}
								
			}//for
			
			staging.add(inputs);
			
		}//while
		
		return staging;
	}//getStaging()
	
	
	
	//staging 테이블 가공작업 -> ERD 테이블의 정보와 비교가능하게끔 바꿔준다.
	public List<String[]> getStagingUpgrade(List<String[]> stgErd) {
		
		List<String[]> stgNewArr = new ArrayList<String[]>();//새롭게 바뀔 리스트
		
		for (int i = 0; i < stgErd.size(); i++) {
			
			String[] stgArr = new String[3];//컬럼이름,형(크기),nullable
			String[] oldTbl = stgErd.get(i);//기존 테이블 컬럼 원소집합
			
			
			String name = oldTbl[0].toLowerCase().trim();//컬럼 이름
			String type = oldTbl[1].toLowerCase().trim();//타입
			String size = oldTbl[2].toLowerCase().trim();//컬럼 사이즈
			String nullable = oldTbl[3].toLowerCase().trim();//null 허용 유무
			
			String typeSize = "";//새롭게 집어넣을 것이다.
			
			if (type.contains("char")) {
				//char 이 들어갔을 경우에
							
				if (size.equals("-1")) {
					//사이즈가 -1 일 경우에
					typeSize = type + "(max)";
				} else {
					//사이즈가 -1이 아닐 경우에
					
					if (type.contains("n")) {
						//유니코드 문자열일 경우에 -> 나누기 2를 해줄것이다.
						int sizeComp = Integer.parseInt(size) / 2;
						
						typeSize = type + "(" + sizeComp + ")";
					} else {
						//유니코드 문자열이 아닐 경우에
						typeSize = type + "(" + size + ")";
					}
					
				}	
			} else {
				//괄호가 의미가 없는 경우 -> 문자형이 아닌타입들에 대해서 처리
				typeSize = type;
			}
			
			stgArr[0] = name;
			stgArr[1] = typeSize;
			stgArr[2] = nullable;
			
			stgNewArr.add(stgArr);
			
				
		}//for
		
		
		return stgNewArr;
	}
	
	
	
	//ERD 에 존재하는 테이블 정보
	public List<String[]> getErd() throws Exception {
		
		BufferedReader readerErd = new BufferedReader(new FileReader("C:\\test\\data.txt"));
		
		String line2 = null;
		
		List<String[]> erdArr = new ArrayList<String[]>();
		
		String[] inputErd = new String[3];//이름,형(크기),null 유무
		int indexErd = 0;
		
		while((line2 = readerErd.readLine())!= null) {
			
			//System.out.println(line2);
			
			line2 = line2.toLowerCase().trim();
			
			if (indexErd == 2) {
				if (line2.toLowerCase().equals("not null") || line2.toLowerCase().equals("identity")) {
					inputErd[indexErd] = "no";
				} else {
					inputErd[indexErd] = "yes";
				}
				
				erdArr.add(inputErd);
				indexErd = 0;
				inputErd = new String[3];
			} else {
				
				inputErd[indexErd] = line2;
				indexErd++;
			}
			
		}//while
		
		return erdArr;
	}//getErd() 
	
	
	//각 테이블 정보를 확인시켜주는 메서드
	public void tableCheck(List<String[]> inputArr) {
		
		int outLength = inputArr.size();//전체 크기
		int innerLength = inputArr.get(0).length;// 한 요소의 크기
		
		
		for (int i = 0; i < outLength; i++) {
			for (int j = 0; j < innerLength; j++) {
				System.out.print(inputArr.get(i)[j] + " ");
			}
			System.out.println();
		}
	}//tableChheck(List<String[]> inputArr)
	
	
	
	
	
	
}
