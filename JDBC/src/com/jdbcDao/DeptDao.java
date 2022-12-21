 package com.jdbcDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import com.jdbc.jdbcUtils;

public class DeptDao implements IDAO<dept, String> {

	@Override
	public void create(dept t) {
		String name=t.getDname();
		String loc=t.getLoc();
		int deptno=t.getDeptno();
		
		String sqlQuery="insert into dept value(?,?,?";
		try(Connection conn=jdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery)){ 
					pstmt.setString(1, name);
					pstmt.setString(2, loc);
					pstmt.setInt(3, deptno);
					
					int updatecount=pstmt.executeUpdate();
					System.out.println("update count="+updatecount);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				}
	
	
		

	@Override
	public Collection<dept> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dept getOne(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(dept t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(String key) {
		// TODO Auto-generated method stub
		
	}
	
	

}
