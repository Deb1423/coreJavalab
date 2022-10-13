package com.test1;

public class ThreadLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable s1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("------------Thread Programme Without Lambda------------");

				System.out.println(Thread.currentThread().getName() + " :- Thread is Going on");

			}

		};

		Thread t1 = new Thread(s1, "Debjit");
		t1.start();

		System.out.println("------------Thread Programme With Lambda------------");

		Runnable s2 = () -> {
			System.out.println(Thread.currentThread().getName() + " :- Thread is Going on");

		};

		Thread t2 = new Thread(s2, "Ankit");
		t2.start();

	}
}
