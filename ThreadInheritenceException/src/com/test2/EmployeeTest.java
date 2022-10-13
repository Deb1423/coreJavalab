package com.test2;

import java.util.Scanner;

public class EmployeeTest {

	static SalariedEmployee s;

	static void enterSalariedEmployee() {

		Scanner sc1 = new Scanner(System.in);
		s = new SalariedEmployee();

		int m[] = new int[12];
		System.out.println("Enter the EmployeeID:");
		s.setId(sc1.nextInt());
		System.out.println("Enter the Employee name:");
		s.setName(sc1.next());
		System.out.println("Enter the Employee age:");
		s.setAge(sc1.nextInt());
		System.out.println("Enter the Employee Experience:");
		s.setStandard(sc1.next());

		for (int i = 0; i < 12; i++) {
			System.out.println("Enter the Month Of  the Salary" + (i + 1) + ":");
			m[i] = sc1.nextInt();
		}

		System.out.println();
		System.out.println();
		System.out.println("Employee Total Salary:- ");
		displaySalariedEmployee();

		sc1.close();

	}

	static void displaySalariedEmployee() {

		System.out.println("ID:" + s.getId());
		System.out.println("Name:" + s.getName());
		System.out.println("Experience:" + s.getStandard());
		System.out.println("Working Days:" + s.getWdays() + "Should works");

	}

	static HourlyEmployee h;

	static void enterHourlyEmployee() {

		Scanner sc1 = new Scanner(System.in);
		h = new HourlyEmployee();

		float m[] = new float[3];
		System.out.println("Enter the EmployeeID:");
		h.setId(sc1.nextInt());
		System.out.println("Enter the Employee name:");
		h.setName(sc1.next());
		System.out.println("Enter the Employee age:");
		h.setAge(sc1.nextInt());
		System.out.println("Enter the Employee Working Days:");
		h.setWdays(sc1.nextInt());
		System.out.println("Enter the Employee Working Hours:");
		h.setWphr(sc1.nextInt());

		for (int i = 0; i < 12; i++) {
			System.out.println("Enter the Month Of  the Salary" + (i + 1) + ":");
			m[i] = sc1.nextInt();
		}

		System.out.println();
		System.out.println();
		System.out.println("Employee Total Salary:- ");
		displaySalariedEmployee();

		sc1.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter 1: To create Salaried Employee:");
		System.out.println("Enter 2: To create Hourly Employee:");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			enterSalariedEmployee();
			break;
		case 2:
			enterHourlyEmployee();
			break;
		default:
			System.exit(0);
		}
		sc.close();
	}

}
