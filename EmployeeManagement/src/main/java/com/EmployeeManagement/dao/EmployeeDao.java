package com.EmployeeManagement.dao;

import com.EmployeeManagement.model.Employee;

public interface EmployeeDao {

	void addEmployee();

	boolean deleteEmployee(int id);

	boolean updateEmployee(int id, Employee ey);

	Employee findEmployee(int id);

	void displayAll();

}
