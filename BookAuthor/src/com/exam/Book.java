package com.exam;

public class Book {

	private int bookid;
	private String bookname;
	private BookAuthor authorName;
	private int pubyear;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String bookname, BookAuthor authorName, int pubyear) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorName = authorName;
		this.pubyear = pubyear;
	}

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

	public BookAuthor getAuthorName() {
		return authorName;
	}

	public void setAuthorName(BookAuthor authorName) {
		this.authorName = authorName;
	}

	public int getPubyear() {
		return pubyear;
	}

	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}

	@Override
	public String toString() {
		return bookid + " " + bookname + "  " + authorName + "  " + pubyear;
	}
}
