package com.test;

public class PerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long stTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Debjit");

		for (int i = 0; i < 10000; i++) {
			sb.append('k');
		}

		long timeTaken = System.currentTimeMillis() - stTime;

		System.out.println("Time taken by StringBuffer:" + timeTaken);

		stTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Debjit");

		for (int i = 0; i < 10000; i++) {
			sb1.append('k');
		}

		timeTaken = System.currentTimeMillis() - stTime;

		System.out.println("Time taken by StringBuilder:" + timeTaken);

	}

}
