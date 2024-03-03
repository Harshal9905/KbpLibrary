package com.kbplibrary.borrower;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.kbplibrary.Connection.MyConnection;

public class UpdateBrOpertion {
	static Scanner sc = new Scanner(System.in);
	static Connection co = MyConnection.getMyConnection();
	public static void getName() {
		System.out.println("Enter borrower Id: ");
		int id = sc.nextInt();
		PreparedStatement ps;
		
		try {
			
			ps = co.prepareStatement("UPDATE Borrower SET borrowername=? WHERE borrowerid="+id+"; ");
			
		
			System.out.println("Enter the name You want to Update: ");
			
			String bookName = sc.next();
			
			
			ps.setString(1, bookName);
			ps.executeUpdate();
			
			int data = ps.executeUpdate();
			System.out.println(data+" Updated Sucesfully");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void deleteBorrower() {
		System.out.println("Enter Borrower Id: ");
		int id = sc.nextInt();
		try {
			
			PreparedStatement ps = co.prepareStatement("DELETE FROM Borrower WHERE borrowerid="+id+";");
			
			int data = ps.executeUpdate();
			
			System.out.println(data+" Deleted Sucesfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
