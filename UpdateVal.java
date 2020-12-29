package com.vastika.project_jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class UpdateVal {

	public static final String SQL = "update java_student set name = 'jessica' where id = 1";
 
	public static void main(String[] args) {
		
		try (
				Connection con = DBUtility.getConnection();
				Statement st = con.createStatement();
				
				
				){
			st.executeUpdate(SQL);
			System.out.println("updated given");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	

		

	}


