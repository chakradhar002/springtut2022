package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	
	
	static final String driver="com.mysql.cj.jdbc.Driver";
	static final String db_url="jdbc:mysql://localhost/test";
	static final String username="root";
	static final String password="root";

	public static void main(String[] args) throws SQLException  {
		// declare variable
		Connection connection=null;
		Statement statment=null;

		try {
			System.out.println("connecting...");
			//loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connecting db
			connection =DriverManager.getConnection(db_url,username,password);
			System.out.println("connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//loading the driver


	}

}
