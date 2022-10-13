package com.test3;

public class Account {

	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {

		balance = balance - amount;
	}

}
