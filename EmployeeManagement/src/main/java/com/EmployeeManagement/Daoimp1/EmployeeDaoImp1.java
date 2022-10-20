package com.EmployeeManagement.Daoimp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.model.Employee;

public class EmployeeDaoImp1 implements EmployeeDao {

	List<Employee> eyList = new ArrayList<Employee>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);
	// creating Employee object

	public void addEmployee() {
		// TODO Auto-generated method stub

		// creating Employee object
		Employee ee = new Employee();
		// input the details of Employee
		System.out.println("Enter the id :");
		ee.setId(sc.nextInt());
		System.out.println("Enter the name :");
		ee.setName(sc.next());
		System.out.println("Enter the Designation :");
		ee.setDesignation(sc.next());
		System.out.println("Enter the Salary :");
		ee.setSalary(sc.nextFloat());

		// adding the Employee into the collection
		eyList.add(ee);
		System.out.println(eyList);

	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub

		boolean status = false;
		Employee edel = null;
		// finding the Employee
		for (Employee e : eyList) {
			if (e.getId() == id)
				edel = e;
		}
		// check whether the record is present
		if (edel == null)
			status = false;
		else {
			eyList.remove(edel);
			status = true;
		}

		return status;
	}

	public boolean updateEmployee(int id, Employee ey) {
		// TODO Auto-generated method stub
		return false;
	}

	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub

		Employee efind = null;
		// finding the Employee
		for (Employee e : eyList) {
			if (e.getId() == id)
				efind = e;
			return efind;
		}
		return efind;

	}

	public void displayAll() {
		// TODO Auto-generated method stub
		for (Employee e : eyList) {
			System.out.println(e);
		}
	}
}
