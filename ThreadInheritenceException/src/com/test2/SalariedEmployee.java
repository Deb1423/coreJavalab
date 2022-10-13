package com.test2;

public class SalariedEmployee extends Employee {

	private String standard;
	private int wdays;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int id, String name, int age, int salaries, String standard, int wdays) {
		super(id, name, age, salaries);
		this.standard = standard;
		this.wdays = wdays;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public double getWdays() {
		return wdays;
	}

	public void setPercentage(int wdays) {
		this.wdays = wdays;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [standard=" + standard + ", wdays=" + wdays + "]";
	}

}
