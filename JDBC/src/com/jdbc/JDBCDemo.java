package com.jdbc;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		String driverClassname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/deva?useSSL=false";
		String username="root";
		String password="RAMBOSINGH12345A#";
		
		String query="select deptno ,dname,loc from dept";
		 
		//Load the driver /loading the class
		Class.forName(driverClassname);
		
		//DriverManager.registerDriver(new Driver());
		//String url="jdbc:mysql://localhost:3306/deva?useSSL=false"
		
		//establish aconnection 
		Connection conn=DriverManager.getConnection(url,username,password);
		
		//Create an Statement
		Statement st=conn.createStatement();
		
		//Execute Query
		ResultSet recordSet=st.executeQuery(query);// store data in tabular form
		                                            //resultset is return type of executeQuery()

        while(recordSet.next()) {              // read data from database
        	int deptno=recordSet.getInt(1);
        	String dname=recordSet.getString(2);
        	String loc=recordSet.getString(3);
        	
        	System.out.println("dept number= "+ deptno +" dept name =" + dname +"dept location=" + loc);
		
		
		
		
		

	}

}}
