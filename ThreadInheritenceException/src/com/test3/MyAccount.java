package com.test3;

public class MyAccount implements Runnable {

	private Account acc = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyAccount k1 = new MyAccount();
		Thread t1 = new Thread(k1, "Debjit");
		Thread t2 = new Thread(k1, "Ankit");

		t1.start();
		t2.start();

	}

	synchronized void makeWithdrawal(int amt) {
		if (acc.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + "  is trying to withdraw " + amt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + "  has withdrawn " + amt);
		} else {
			System.out.println(
					Thread.currentThread().getName() + "  Account has  not having enough balance to withdraw " + amt);
			System.out.println("The balance is" + acc.getBalance());
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makeWithdrawal(1000);
		if (acc.getBalance() < 0) {
			System.out.println("Amount is overdrawn");
		}

	}

}
