package com.test;

import java.util.Scanner;

public class Palindrome {

	static boolean checkPalindrome(String str) {

		boolean status;

		char ch[] = str.toCharArray();

		String revstrString = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			revstrString += ch[i];
		}

		int flag = str.compareTo(revstrString);
		if (flag == 0)
			status = true;
		else
			status = false;

		return status;
	}

	static boolean checkPalindrome2(String str) {

		boolean status;

		String revstrString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revstrString += str.charAt(i);
		}

		int flag = str.compareTo(revstrString);
		if (flag == 0)
			status = true;
		else
			status = false;

		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for a check:");
		String s = sc.next();
		boolean check = checkPalindrome(s);
		if (check) {
			System.out.println("The written subject is a palindrome");

		}

		else
			System.out.println("The written subject is not a palindrome");
		sc.close();
	}

}
