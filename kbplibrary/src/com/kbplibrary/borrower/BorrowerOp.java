package com.kbplibrary.borrower;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.kbplibrary.Connection.MyConnection;

public class BorrowerOp {
	static Scanner sc = new Scanner(System.in);
	static MultipleBorrower mbv = new MultipleBorrower();
	static BorrowVar bov = new BorrowVar();
	static Connection co =MyConnection.getMyConnection();
	public static void getBorrDetails() {
		
		
		System.out.println("Enter Your ID: ");
		int borid = sc.nextInt();
		bov.setBorrId(borid);
		System.out.println("Enter Name");
		String borName = sc.next();
		bov.setBorrName(borName);
		
		System.out.println("check");
		try {
			
			Statement st =co.createStatement();
			ResultSet rst = st.executeQuery("SELECT * FROM borrower");
			boolean found= false;
			while(rst.next()) {
//				System.out.println("check in while");
				int existingId= rst.getInt("borrowerId");
				if(borid==existingId) {
					BorrowerOp.getBook(existingId, st, rst);
					found  = true;
					break;
				}
				
				
				
			}
			if(!found) {
				mbv.addBook(bov);
				mbv.saveData();
				BorrowerOp.getBook();
			}
		
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
//		
	}
		
		public static void getBook(int existingId, Statement st, ResultSet rst) throws SQLException {
			
//			Statement st =co.createStatement();
//			ResultSet rst = st.executeQuery("SELECT * FROM borrower");
		
			System.out.println("Enter book Id");
			int bookId =sc.nextInt();
			PreparedStatement pst = co.prepareStatement("SELECT * FROM books WHERE bookId=?");
			
			pst.setInt(1, bookId);
			ResultSet resultset = pst.executeQuery();
			PreparedStatement borrower = co.prepareStatement("UPDATE borrower SET bookname=?, bookid=?, issuedate=? WHERE borrowerid="+existingId+";");
			
			while(resultset.next()) {
				int ids = resultset.getInt("bookId");
				String bName= resultset.getString("bookname");
				LocalDate date= LocalDate.now();
				Date d = Date.valueOf(date);
				borrower.setString(1, bName);
				borrower.setInt(2, ids);
				borrower.setDate(3, d);
				borrower.executeUpdate();
				System.out.println("Book Issued");
					
		

				}
			
		
		}
		public static void getBook() throws SQLException {
			int existingId= 0;
			Statement st =co.createStatement();
			ResultSet rst = st.executeQuery("SELECT * FROM borrower");
			while(rst.next()) {
				
				existingId= rst.getInt("borrowerId");
				
			}
			
			System.out.println("Enter book Id");
			int bookId =sc.nextInt();
			PreparedStatement pst = co.prepareStatement("SELECT * FROM books WHERE bookId=?");
			
			pst.setInt(1, bookId);
			ResultSet resultset = pst.executeQuery();
			PreparedStatement borrower = co.prepareStatement("UPDATE borrower SET bookname=?, bookid=?, issuedate=? WHERE borrowerid="+existingId+";");
			
			while(resultset.next()) {
				int ids = resultset.getInt("bookId");
				String bName= resultset.getString("bookname");
				LocalDate date= LocalDate.now();
				Date d = Date.valueOf(date);
				borrower.setString(1, bName);
				borrower.setInt(2, ids);
				borrower.setDate(3, d);
				borrower.executeUpdate();
				System.out.println("Book Issued");
				}
			
		
		}
}
