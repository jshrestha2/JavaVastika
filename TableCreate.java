package com.vastika.project_jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {
	public static final String URL = "jdbc:mysql://localhost:3306/javademo";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "Baneshwor1!";
	public static final String SQL = "create table java_student (id int not null auto_increment, name varchar(25), primary key (id))";
	public static void main(String[] args) {
		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st = con.createStatement();
				){
st.executeUpdate(SQL);
System.out.println("table create");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
