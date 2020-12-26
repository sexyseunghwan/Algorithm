package com.test.qoo10;

import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception{
		//직접 실행해주는곳
		TableCompare tc = new TableCompare();
		
		List<String[]> stagingTable = tc.getStaging();//스테이징에 존재하는 테이블 정보
		List<String[]> erdTable = tc.getErd();
		List<String[]> stagingTableUp = tc.getStagingUpgrade(stagingTable);
		
		//확인용
		tc.tableCheck(stagingTableUp);
		//tc.tableCheck(stagingTable);
		System.out.println("============");
		tc.tableCheck(erdTable);
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		//비교
		ComparisonTable cst = new ComparisonTable();
		cst.comparisonTable(stagingTableUp, erdTable);
		
		
	}
}
