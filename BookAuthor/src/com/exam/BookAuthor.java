package com.exam;

public class BookAuthor {

	private String authorName;
	private int age;
	private String gender;
	private long phoneNumber;

	public BookAuthor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookAuthor(String authorName, int age, String gender, long phoneNumber) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;

	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return authorName + " " + age + "  " + gender + "  " + phoneNumber;

	}
}
