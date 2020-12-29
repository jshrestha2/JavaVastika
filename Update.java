package com.vastika.project_jdbc_demo.ps;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class Update {
	public static final String SQL = "update java_student set name=?, phn=?, age=?, dob=? where id =?";

	public static void main(String[] args) {
		
		try (
				
				PreparedStatement ps = DBUtility.getConnection().prepareStatement(SQL);
				
				
				){
			ps.setString(1, "jasmine");
			ps.setInt(3, 25);
			ps.setLong(2, 972832348);
			ps.setDate(4, new Date(239922));
			
			ps.setInt(5, 1); //THIS IS WHERE ID=? THE ROW WE WANT TO CHANGE, 5 IS # OF ?
			
			ps.executeUpdate();
			System.out.println("UPDATED");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}



