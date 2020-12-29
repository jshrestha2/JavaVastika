package com.vastika.project_jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class Select {
	public static final String SQL = "select* from java_student";
	 
	public static void main(String[] args) {
		
		try (
				Connection con = DBUtility.getConnection();
				Statement st = con.createStatement();
				
				
				)
		//with select statement this is where we make the changes
		{
		ResultSet rs =	st.executeQuery(SQL);
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}
