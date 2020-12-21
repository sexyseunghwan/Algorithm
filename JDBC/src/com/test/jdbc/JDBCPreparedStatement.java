package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCPreparedStatement {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		DBUtil util = new DBUtil();
		
		try {
			
			conn = util.open();
			
			String sql = "SELECT * FROM dbo.TBLINSA WHERE buseo = ?";
			
			stat = conn.prepareStatement(sql);
			stat.setString(1, "기획부");
			
			rs = stat.executeQuery();
			
			while(rs.next()) {
				
				String num = rs.getString("num");
				String name = rs.getString("name");
				String buseo = rs.getString("buseo");
				
				
				System.out.printf("%s %s %s\n",num,name,buseo);
				
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

	
	

}
