package com.exam;

public class BookDetails {

	static void display(Book b) {
// 	System.out.println("Book Id:" + b.getbookId());
//	System.out.println("Book Name:" + b.getbookname());
//		System.out.println("Author Name:" + b.getauthorName());
//		System.out.println("publication Year:" + b.getpubyear());

		System.out.println(b);

	}

	public static void main(String[] args) {

		Book b1 = new Book(11, "Adbhuture", new BookAuthor("Debjit", 22, "Male", 8334895921), 2022);

		System.out.println("Details are:");

		display(b1);

	}

}
