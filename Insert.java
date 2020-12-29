package com.vastika.project_jdbc_demo.ps;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class Insert {
	public static final String SQL = "insert into java_student(name, phn, age, dob)values(?,?,?,?)";

	public static void main(String[] args) {
		
		try (
				
				PreparedStatement ps = DBUtility.getConnection().prepareStatement(SQL);
				
				
				){
			ps.setString(1, "jessy");
			ps.setInt(3, 24);
			ps.setLong(2, 97283848);
			ps.setDate(4, new Date(2020, 11, 01));
			
			ps.executeUpdate();
			System.out.println("value given");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}


