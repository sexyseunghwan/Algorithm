package com.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ProcedureStatement {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		CallableStatement stat = null;//프로시저 전용이다.
		ResultSet rs = null;
		DBUtil util = new DBUtil();
		
		try {
			
			conn = util.open();
			
			String sql = "{call sh_test1(?)}";
			stat = conn.prepareCall(sql);
			
			stat.setString(1,"기획부");
			
			rs = stat.executeQuery();
			
			//jdbc ...
			while (rs.next()) {
				
				String name = rs.getString("name");
				String buseo = rs.getString("buseo");
				String jikwi = rs.getString("jikwi");
				
				System.out.printf("%s %s %s\n",name,buseo,jikwi);
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
