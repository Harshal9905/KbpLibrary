package com.kbplibrary;

import java.util.Scanner;

import com.kbplibrary.borrower.BorrowerOp;
import com.kbplibrary.borrower.UpdateBorrower;

public class Home {
	 static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("press 1 for add book\npress 2 for add borrower\npress 3 for Update book\nPress 4 for Update Borrower");
		int ch= sc.nextInt();
		switch(ch) {
		case 1:
			Operation.getDetails();
			break;
		case 2:
			BorrowerOp.getBorrDetails();
			break;
		case 3:
			Operation.updateDetails();
			break;
		case 4:
			UpdateBorrower.borrowerUpdate();
		}
		
	}

}
