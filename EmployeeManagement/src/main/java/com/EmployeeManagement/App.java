package com.EmployeeManagement;

import java.util.Scanner;

import com.EmployeeManagement.Daoimp1.EmployeeDaoImp1;
import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.model.Employee;

/**
 * Hello world!
 *
 */
public class App {

	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Search Employee");
		System.out.println("5. Display all the Employees");
		System.out.println("6.Exit");
	}

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		EmployeeDao office = new EmployeeDaoImp1();

		// declaring varible choice
		int m = 0;
		do {
			menu();
			m = sc1.nextInt();
			switch (m) {

			case 1:
				office.addEmployee();
				System.out.println("Employee inserted..........");
				break;
			case 2:
				System.out.println("Enter the Id to be deleted:");
				int id = sc1.nextInt();
				boolean flag = office.deleteEmployee(id);
				if (flag)
					System.out.println("Employee deleted.......");
				else
					System.out.println("Employee not found......");
				break;
			case 4:
				Employee ee = null;
				System.out.println("Enter the Id to be searched:");
				id = sc1.nextInt();
				ee = office.findEmployee(id);
				if (ee == null)
					System.out.println("Employee not found.......");
				else
					System.out.println("Employee Id :" + ee.getId() + "  Name:" + ee.getName() + " Designation: "
							+ ee.getDesignation() + " Salary:" + ee.getSalary());
				break;
			case 5:
				office.displayAll();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input.......");
			}
		} while (m != 6);

		// end of do while

		sc1.close();
	}
}
