package com.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCPreparedStatement {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		String driverClassname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/deva?useSSL=false";
		String username="root";
		String password="RAMBOSINGH12345A#";
		
		String query="select* from dept where deptno=? ";
		//String query="insert into dept value (?,?,? )";
		
		Class.forName(driverClassname);
		Connection conn=DriverManager.getConnection(url,username,password);
		PreparedStatement psmt=conn.prepareStatement(query);
		
		psmt.setInt(1, 30);
		//psmt.setString(2,"SALES ");
		
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next()) {
			
			int deptno=rs.getInt(1);
			
			//String loc=rs.getString(1);
			//String dname=rs.getString(2);
			System.out.println("deptno="+deptno);//+"dname="+dname+"loc="+loc);
		}
		
		

}
}
