package com.test.qoo10;

import java.util.ArrayList;
import java.util.List;

//테이블 끼리 비교해주는 class
public class ComparisonTable {

	
	public void comparisonTable(List<String[]> stgList,List<String[]> erdList) {
		
		int stgSize = stgList.size();//스테이징에 있는 테이블 컬럼 개수
		int erdSize = erdList.size();//erd에 있는 테이블 컬럼개수
		
		if (stgSize > erdSize) {
			//staging 에 있는 테이블이 erd 에 있는 테이블보다 컬럼 개수가 많은 경우
			bigTable(stgList,erdList,"staging");
			
		} else if (stgSize < erdSize) {
			//staging 에 있는 테이블이 erd 에 있는 테이블보다 컬럼 개수가 적은경우
			bigTable(erdList,stgList,"erd");
			
		} else {
			//staging 에 있는 테이블과 erd 에 있는 테이블의 컬럼 개수가 같은 경우
			tableEquals(stgList,erdList);
			
		}	
	}
	
	public void tableEquals(List<String[]> stgList,List<String[]> erdList) {
		//테이블의 컬럼 개수가 같은 경우 --> 이부분이 생각해 줄게 엄청 많은 부분이다.
		//List<String> errArr = new ArrayList<String>();//에러 컬럼명 넣어줄 것이다. 기준은 staging 을 기준으로 한다.
	
		//1. staging => erd
		int result1 = stgToErd(stgList,erdList);
		
		//2. erd => staging
		int result2 = erdToStg(stgList,erdList);

		//3. staging <=> erd
		if (result1 == 0 && result2 == 0) {
			//둘다 문제가 없는 경우 -> 이제 진짜 여기서 staging 과 erd 를 비교할 것이다.
			int finalResult = equivalent(stgList,erdList);
			
			if (finalResult == 0) {
				//문제 없는경우
				System.out.println("ERD STAGING 모두 동치");
			} 
		}
		
	}//tableEquals()
	
	public int equivalent(List<String[]> stgList,List<String[]> erdList) {
		// srg <=> erd
		List<String> errArr = new ArrayList<String>();
		
		int result = 0;//0일때는 문제없음
		
		for (int i = 0; i < stgList.size(); i++) {
			String[] stgArr = stgList.get(i);
			
			String word = "";
			
			String stgName = stgArr[0];
			String stgType = stgArr[1];
			String stgNull = stgArr[2];
			
			//int typeNum = 0;//0 : 문제없음, 1 : 타입이나 null이 맞지않음
			
			for (int j = 0; j < erdList.size(); j++) {
				
				String[] erdArr = erdList.get(j);
				
				String erdName = erdArr[0];
				String erdType = erdArr[1];
				String erdNull = erdArr[2];
				
				if (stgName.equals(erdName)) {
					if (stgType.equals(erdType) && stgNull.equals(erdNull)) {
						//나머지 형도 모두 같은 경우
						break;
					} else {
						//타입이나 null이 맞지 않은경우
						//typeNum = 1;
						result = 1;
						word = String.format("[ERD] %s %s %s => [STG] %s %s %s", erdName,erdType,erdNull,stgName,stgType,stgNull);
						errArr.add(word);
						break;
					}
				}
			}//for
		}//for
		
		if (result != 0) {
			
			System.out.println("*******************");
			for (int i = 0; i < errArr.size(); i++) {
				System.out.println(errArr.get(i));
			}
			System.out.println("*******************");
				
		}
		
		return result;
		
	}
	
	
	public int erdToStg(List<String[]> stgList,List<String[]> erdList) {
		//erd => stg
		
		List<String[]> errArr = new ArrayList<String[]>();//에러 컬럼명 넣어줄 것이다.
		
		int result = 0;//문제가 없는경우 0 이 반환 문제가 존재하면 1이 반환
		
		for (int i = 0;i < erdList.size(); i++) {
			String[] erdArr = erdList.get(i);
			String erdName = erdArr[0];
			
			boolean flag = false;
			
			for (int j = 0; j < stgList.size(); j++) {
				String[] stgArr = stgList.get(j);
				
				String stgName = stgArr[0];
				
				if (erdName.equals(stgName)) {
					flag = true;
					break;
				}
			}//for
			
			if (!flag) {
				//staging 에 있는 컬럼이 없는경우
				errArr.add(erdArr);
				result = 1;
			}
			
		}//for
		
		if (errArr.size() != 0) {
			//문제가 있는경우
			System.out.println("*******************");
			System.out.println("erdTo 문제가 존재하는 컬럼 개수 : " + errArr.size());
			System.out.println("=== erd 에는 있지만 stg 에는 없는 컬럼이름 리스트 ===");
			
			for (int i = 0; i < errArr.size(); i++) {
				for (int j = 0; j < errArr.get(i).length; j++) {
					System.out.print(errArr.get(i)[j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("*******************");
		}
	
		return result;
		
	}
	
	public int stgToErd(List<String[]> stgList,List<String[]> erdList) {
		
		//stg => erd
		
		List<String[]> errArr = new ArrayList<String[]>();//에러 컬럼명 넣어줄 것이다.
		
		int result = 0;//문제 없을 경우 0 문제있는경우 1
		
		
		
		for (int i = 0; i < stgList.size(); i++) {
			String[] stgArr = stgList.get(i);
			String stgName = stgArr[0];
			
			boolean flag = false;
			
			for (int j = 0; j < erdList.size(); j++) {
				String[] erdArr = erdList.get(j);
				
				String erdName = erdArr[0];
				
				if (stgName.equals(erdName)) {
					flag = true;
					break;
				}
			}//for
			
			if (!flag) {
				//staging 에 있는 컬럼이 없는경우
				errArr.add(stgArr);
				result = 1;
			}
			
		}//for
		
		if (errArr.size() != 0) {
			//문제가 있는경우 
			System.out.println("*******************");
			System.out.println("stagingTo 문제가 존재하는 컬럼 개수 : " + errArr.size());
			System.out.println("=== staging 에는 있지만 erd 에는 없는 컬럼이름 리스트 ===");
			
			for (int i = 0; i < errArr.size(); i++) {
				for (int j = 0; j < errArr.get(i).length; j++) {
					System.out.print(errArr.get(i)[j] + " ");
				}
				System.out.println();
			}
			System.out.println("*******************");
		}
	
		return result;
		
	}//stgToErd()
	
	public void bigTable(List<String[]> bigList,List<String[]> smallList,String db) {
		
		List<String[]> errArr = new ArrayList<String[]>();//에러 컬럼명 넣어줄 것이다.
		
		for (int i = 0; i < bigList.size(); i++) {
			
			String[] bigArr = bigList.get(i);//stg 컬럼
			String bigName = bigArr[0];
			
			boolean flag = false; 
			
			for (int j = 0; j < smallList.size(); j++) {
				
				String smallName = smallList.get(j)[0];
				
				if (bigName.equals(smallName)) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				//staging 에 있는게 없다는 의미 아니면 잘못됬다는 의미가 된다.
				errArr.add(bigArr);
			}	
		}//for
		
		System.out.println("=========================");
		System.out.println(db + " 에 컬럼개수가 더 많음");
		for (int i = 0; i < errArr.size(); i++) {
			for (int j = 0; j < errArr.get(i).length; j++) {
				System.out.print(errArr.get(i)[j] + " ");
			}
			System.out.println(" 누락");
		}
		
		
	}//bigTable()
	
	

	
	
}
