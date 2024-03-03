package com.kbplibrary.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kbplibrary.Bookvar;
import com.kbplibrary.borrower.BorrowVar;

public class MyDatabase {
	static Connection co = MyConnection.getMyConnection();
	public static void save(ArrayList<Bookvar> list) {
		
		
		try {
			PreparedStatement ps = co.prepareStatement("INSERT INTO books (bookid, bookname, bookAuthor) VALUES(?,?,?)");
			for (Bookvar bk : list) {
				int bookId = bk.getBookid();
				String bookName = bk.getBookname();
				String bookAuthor = bk.getBookauthor();
				ps.setInt(1, bookId);
				ps.setString(2, bookName);
				ps.setString(3, bookAuthor);
				int data = ps.executeUpdate();
				System.out.println(data+" Inserted Sucesfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void saveBorower(ArrayList<BorrowVar> list) {
		try {
			PreparedStatement ps1 = co.prepareStatement("INSERT INTO Borrower (borrowerid, borrowername) VALUES(?,?)");
			for(BorrowVar bov: list) {
				int borid = bov.getBorrId();
				String borname = bov.getBorrName();
				ps1.setInt(1, borid);
				ps1.setString(2, borname);
				int data = ps1.executeUpdate();
				System.out.println(data+" Inserted Sucesfully");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
