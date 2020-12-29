package com.vastika.project_jdbc_demo.ps;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.project_jdbc_demo.util.DBUtility;

public class Delete {
	public static final String SQL = "delete from java_student where name = ?";
	public static void main(String[] args) {
		
		try (
				
				PreparedStatement ps = DBUtility.getConnection().prepareStatement(SQL);
				
				
				){
			
			
			ps.setString(1, "jessy"); //THIS IS WHERE ID=? THE ROW WE WANT TO CHANGE, 5 IS # OF ?
			
			ps.executeUpdate();
			System.out.println("deleted");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}



