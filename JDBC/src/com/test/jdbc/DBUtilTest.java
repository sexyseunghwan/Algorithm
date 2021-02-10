package com.test.jdbc;

import java.sql.Connection;

public class DBUtilTest {

	public static void main(String[] args) {
		
		DBUtil util = new DBUtil();
		
		Connection conn = null;
		
		try {
			//conn = util.open();
			//conn = util.open("localhost", "ADMIN", "sa", "java1234");
			//System.out.println(conn.isClosed());//false 가 나와야 접속에 성공한것이다.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
