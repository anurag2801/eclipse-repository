package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcUtils {
	
	public static Connection buildConnection() throws Exception{
		
		String driverClassName="com.mysql.cj.jdbc.Driver";
		String connectionUR1="jdbc:mysql://localhost:3306/deva";
		String UserId="root";
		String password="RAMBOSINGH12345A#";
		Class.forName(driverClassName);
		
		Connection conn=DriverManager.getConnection(connectionUR1,UserId,password);
		return conn;
		
	}

}
