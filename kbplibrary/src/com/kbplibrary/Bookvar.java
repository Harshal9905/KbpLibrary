package com.kbplibrary;

public class Bookvar {
	private int bookid;
	private String bookname;
	private String bookauthor;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	
	
//	public Bookvar(int bookid, String bookname, String bookauthor) {
//		super();
//		this.bookid = bookid;
//		this.bookname = bookname;
//		this.bookauthor = bookauthor;
//	}
	@Override
	public String toString() {
		return "Bookvar [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor +"]";
	}
	
	
}
