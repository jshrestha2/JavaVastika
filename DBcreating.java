package com.vastika.project_jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcreating {
	//first need to make  constant so this is the process
	//this is how we are connecting to our sql workbench
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "Baneshwor1!";
	public static final String SQL = "create database javademo1";
	public static void main(String[] args) {
		//step 1 register driver by making an connection
		Connection con = null;
		Statement statm = null;
		
		try {
			//STEP 1 REGISTER DRIVER
			Class.forName(DRIVER_NAME);
			//step 2 get connection object
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			// STEP 3 GET STATEMENT OBJ
			statm = con.createStatement();
			//step 4 execute a query
			statm.executeUpdate(SQL);
			System.out.println("success");
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();}
		finally {
			try {
				//step 5 close the connection
				con.close();
				statm.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
