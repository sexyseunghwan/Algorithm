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
		
		try {
			//db 연결잼
			conn = util.open("localhost", "ADMIN", "sa", "java1234");
			stat = conn.createStatement();
			
			//String sql = "select * from dbo.TBLINSA";
			String sql = "SELECT COUNT(*) AS cnt FROM dbo.TBLINSA";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				//String num = rs.getString("num");
				//String name = rs.getString("name");
				
				//System.out.printf("%s %s\n",num,name);
				
				
				int count = rs.getInt("cnt");				
				System.out.println(count);

			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
