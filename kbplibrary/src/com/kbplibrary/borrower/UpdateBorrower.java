package com.kbplibrary.borrower;


import java.util.Scanner;



public class UpdateBorrower {
	static Scanner sc = new Scanner(System.in);
	public static void borrowerUpdate() {
		System.out.println("Press 1 for update Borrower Name\nPress 2 for Delete borrower");
		int ch = sc.nextInt();
		
		switch(ch) {
	
		case 1:
			System.out.println("cheak");
			UpdateBrOpertion.getName();
			break;
		case 2:
			UpdateBrOpertion.deleteBorrower();
			break;
//		case 3:
//			UpdateOpertion.deleteBook();
//			break;
		}
	}
	
}
