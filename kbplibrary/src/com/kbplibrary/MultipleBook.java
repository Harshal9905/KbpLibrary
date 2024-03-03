package com.kbplibrary;

import java.util.ArrayList;

import com.kbplibrary.Connection.MyDatabase;

public class MultipleBook {
	private ArrayList<Bookvar> list;
	public MultipleBook(){
		this.list = new ArrayList<Bookvar>();
	}
	public void addBook(Bookvar bk) {
		list.add(bk);
		System.out.println(list);
	}
	public void saveData() {
		MyDatabase.save(list);
	}
}
