package com.vastika.project_jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class InsertVal {
	public static final String SQL = "insert into java_student(name)values('jess')";

	public static void main(String[] args) {
		
		try (
				Connection con = DBUtility.getConnection();
				Statement st = con.createStatement();
				
				
				){
			st.executeUpdate(SQL);
			System.out.println("value given");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}


