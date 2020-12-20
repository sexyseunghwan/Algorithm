package com.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    
	public static void main(String[] args) throws ClassNotFoundException {
        
		try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:8095;database=ADMIN;user=sa;password=Sh@156452";
            Connection conn = DriverManager.getConnection(connectionUrl);
            //Statement stmt = conn.createStatement();
            CallableStatement stat = null;
            ResultSet rs = null;
            System.out.println("MS-SQL 서버 접속에 성공하였습니다.");
            
            //ResultSet rs = stmt.executeQuery("SELECT name,ssn FROM dbo.TBLINSA");
            //String sql = "{call proctestsh(?)}";
            
            CallableStatement cs = conn.prepareCall("{call proctestsh(?)}");
            cs.setInt(1, 1);
            
            stat.executeQuery();
            
            rs = (ResultSet)stat.getObject(1);
            
            while (rs.next()) {
            	System.out.println(rs.getString("Doctor"));
            }
            
            //cs.execute();
            
//            while( rs.next() ) {
//                   String field1 = rs.getString("name");
//                   String field2 = rs.getString("ssn");
//                   System.out.print(field1 + "\t");
//                   System.out.println(field2);
//            }
            
            cs.close();
            //rs.close();
            //stmt.close();   
            stat.close();
            conn.close();
        } catch (SQLException sqle) {
            System.out.println("SQLException : " + sqle);
        }
    }
}
