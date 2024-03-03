package com.kbplibrary.borrower;

import java.util.ArrayList;


import com.kbplibrary.Connection.MyDatabase;

public class MultipleBorrower {
	private ArrayList<BorrowVar> list;
	public MultipleBorrower(){
		this.list = new ArrayList<BorrowVar>();
	}
	public void addBook(BorrowVar bov) {
		list.add(bov);
		System.out.println(list);
	}
	public void saveData() {
		MyDatabase.saveBorower(list);
	}
}
