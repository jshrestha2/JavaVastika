package com.vastika.project_jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class Select {
	public static final String SQL = "select* from java_student";
	 
	public static void main(String[] args) {
		
		try (
				Connection con = DBUtility.getConnection();
				PreparedStatement ps = DBUtility.getConnection().prepareStatement(SQL);
				
				
				) 
		//with select statement this is where we make the changes
		{
		ResultSet rs =	ps.executeQuery(SQL);
		
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
