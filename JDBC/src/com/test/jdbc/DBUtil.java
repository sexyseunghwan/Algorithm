package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

//DBUtil 만들기
public class DBUtil {

	
	private Connection conn = null;
	
	public Connection open() {//포트를 열어준는 메서드라고 생각하면 된다 -> 로컬 계정 열떄 사용하는 메서드
		String url = "jdbc:sqlserver://192.168.35.93:11289;database=ADMIN";
		String id = "byeanma";
		String pw = "java1234";
		
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//sql server 를 이용하기 위함.
			
			//접속 (DB 연결 + connection 객체 생성 반환) -> 접속버튼 누른거와 같은 행동이 되는것이다.
			conn = DriverManager.getConnection(url, id, pw);
			return conn;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;//여기로 오면 접속 실패
	}

	 
	
	public Connection open(String host,String db,String port,String id,String pw) {
		
		
		String url = "jdbc:sqlserver://" + host + ":" + port + ";database=" + db;
		
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn = DriverManager.getConnection(url,id,pw);
			return conn;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
}
