package com.kbplibrary.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	static Connection co;
	public static Connection getMyConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			co = DriverManager.getConnection("jdbc:mysql://localhost:3306/kbplibrary", "root", "Root@123");
			return co;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return co;
	}
}
