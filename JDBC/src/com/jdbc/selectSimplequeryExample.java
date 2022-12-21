package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectSimplequeryExample {
	
	
	public static void main(String[] args) {
		
		String driverClassname="com.mysql.cj.jdbc.Driver";
		
		String connectionUR1="jdbc:mysql://localhost:3306/deva?useSSL=false";
		String Userid="root";
		String password="RAMBOSINGH12345A#";
		
		try {
			
			Class.forName(driverClassname);// load the driver
			System.out.println("Driver loaded");
			
			Connection conn=DriverManager.getConnection(connectionUR1,Userid,password);// established connection
			System.out.println("connected to db"+conn);
			
			Statement stmt=conn.createStatement();
			
			
			String sqlQuery="select deptno ,dname,loc from dept";
			
			ResultSet recordSet=stmt.executeQuery(sqlQuery);
			
			while(recordSet.next()) {
				
				int deptno=recordSet.getInt(1);
				String dname=recordSet.getString(2);
				String loc=recordSet.getString(3);
			
				
				System.out.println("dept number" + deptno +"deptname"+ dname+"location"+loc);
				
			
			}}catch(ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
							
			}
			
		
	}}
	


