package com.jdbc;

import java.sql.*;

import java.sql.Connection;
import java.util.Properties;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLexceptions;


import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Driver;

public class SimpleSelectqueryExamplewithDriverinterface {

	public static void main(String[] args) {
		
		String connectionUR1="jdbc:mysql://localhost:3306/deva?useSSL=false";
		
		try {
			
			Driver dr= (Driver) new com.mysql.cj.jdbc.Driver();
			
			Properties jdbcprops=new Properties();
			jdbcprops.put("user","root");
			jdbcprops.put("password", "RAMBOSINGH12345A#");
			Connection conn=dr.connect(connectionUR1,jdbcprops);
			
			Statement stmt=conn.createStatement();
			
			String sqlQuery="select deptno .dname,loc from dept";
			
			ResultSet recordSet=stmt.executeQuery(sqlQuery);
			
			
            while(recordSet.next()) {
            	int deptno=recordSet.getInt(1);
            	String dname=recordSet.getString(2);
            	String loc=recordSet.getString(3);
            	
            	System.out.println("dept number= "+ deptno +" dept name =" + danme +"dept location=" + loc);
            	
            }
		}
		
		//catch(ClassNotFoundexcetion ex) {
			
		//	ex.printStackTrace();
		//}
		catch(SQLException e) {
			
			e.printStackTrace();}
		
		
            }
	}


