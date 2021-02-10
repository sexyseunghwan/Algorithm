package com.test.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCStatement {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		DBUtil util = new DBUtil();
		
		//String host,String db,String port,String id,String pw
		
		try {
			//db 연결잼
			conn = util.open("192.168.35.93","ADMIN","11289", "byeanma", "java1234");
			stat = conn.createStatement();
			
			//String sql = "select * from dbo.TBLINSA";
			String sql = "SELECT COUNT(*) AS cnt FROM dbo.TBLINSA";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				
				//int count = rs.getInt("cnt");				
				//System.out.println(count);

			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
