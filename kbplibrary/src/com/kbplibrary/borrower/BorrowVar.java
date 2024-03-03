package com.kbplibrary.borrower;

public class BorrowVar {
	@Override
	public String toString() {
		return "BorrowVar [borrId=" + borrId + ", borrName=" + borrName + ", bookName=" + bookName + ", bookid="
				+ bookid + ", fine=" + fine + "]";
	}
	private int borrId;
	private String borrName;
	private String bookName;
	private int bookid;
	private int fine;
	public int getBorrId() {
		return borrId;
	}
	public void setBorrId(int borrId) {
		this.borrId = borrId;
	}
	public String getBorrName() {
		return borrName;
	}
	public void setBorrName(String borrName) {
		this.borrName = borrName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public BorrowVar(int borrId, String borrName, String bookName, int bookid, int fine) {
		super();
		this.borrId = borrId;
		this.borrName = borrName;
		this.bookName = bookName;
		this.bookid = bookid;
		this.fine = fine;
	}
	public BorrowVar() {
		super();
		// TODO Auto-generated constructor stub
	} 
}
