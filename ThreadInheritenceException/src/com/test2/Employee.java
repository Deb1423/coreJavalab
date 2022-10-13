package com.test2;

public class Employee {

	private int id;
	private String name;
	private int age;
	private int salaries;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, int salaries) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salaries = salaries;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getsalaries() {
		return salaries;
	}

	public void setMarks(int salaries) {
		this.salaries = salaries;
	}

	public double perannumsalary(int... salaries) {
		double mon = 0.0;
		for (int i = 0; i < salaries.length; i++) {
			mon += salaries[i];
		}

		mon = (mon * 12);
		return mon;
	}

}
