package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCupdate {
public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		String driverClassname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/deva?useSSL=false";
		String username="root";
		String password="RAMBOSINGH12345A#";
		
		String query="insert into dept values(60,'Market','SF')";
		String query2="select deptno ,dname,loc from dept";
		
		 
		//Load the driver
		Class.forName(driverClassname);
		
		//establish a connection 
		Connection conn=DriverManager.getConnection(url,username,password);
		
		//Create an Statement
		Statement st=conn.createStatement();
		
		//Execute Query
		
		//update query
		int count=st.executeUpdate(query);//update operation thats why we use executeUpdate and its return type is int
		System.out.println("Number of row updated="+count);//
		
		//read query
		ResultSet recordSet=st.executeQuery(query2);// store data in tabular form
        //resultset is return type of executeQuery()

        while(recordSet.next()) {              // read data from database
        int deptno=recordSet.getInt(1);
        String dname=recordSet.getString(2);
        String loc=recordSet.getString(3);

        System.out.println("dept number= "+ deptno +" dept name =" + dname +"dept location=" + loc);

		
		// this program only works one time because once we update the record after that if we again run the program then its 
		//program try to update again but record is already there thats why it return back exception


}
}}