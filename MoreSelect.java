package com.vastika.project_jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class MoreSelect {

	public static final String SQL = "select * from java_student where id=?";
	 
	public static void main(String[] args) {
		
		try (
				
				PreparedStatement ps = DBUtility.getConnection().prepareStatement(SQL);
				
				
				
				) 
		//with select statement this is where we make the changes
		{
			ps.setInt(1, 1);
			
		ResultSet rs =	ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getInt("age"));
			System.out.println(rs.getDate("dob"));

		}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}

