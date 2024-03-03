package com.kbplibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.kbplibrary.Connection.MyConnection;

public class UpdateOpertion {
	static Scanner sc = new Scanner(System.in);
	static Connection co = MyConnection.getMyConnection();
	public static void getName() {
		System.out.println("Enter Book Id: ");
		int id = sc.nextInt();
		PreparedStatement ps;
		
		try {
			
			ps = co.prepareStatement("UPDATE Books SET bookname=? WHERE bookid="+id+"; ");
			
		
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

	public static void getAuthor() {
		System.out.println("Enter Book Id: ");
		int id = sc.nextInt();
		
		try {
			
			PreparedStatement ps = co.prepareStatement("UPDATE Books SET bookauthor=? WHERE bookid="+id+"; ");
		
		
			
			String bookAuthor = sc.next();
			
			
			ps.setString(1, bookAuthor);
			
			int data = ps.executeUpdate();
			System.out.println(data+" Updated Sucesfully");
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void deleteBook() {
		System.out.println("Enter Book Id: ");
		int id = sc.nextInt();
		try {
			PreparedStatement ps = co.prepareStatement("DELETE FROM Books WHERE bookid="+id+";");
			int data = ps.executeUpdate();
			System.out.println(data+" Deleted Sucesfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
		
	}


