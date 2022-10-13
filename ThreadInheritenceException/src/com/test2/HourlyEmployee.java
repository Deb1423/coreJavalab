package com.test2;

public class HourlyEmployee extends Employee {

	private String standard;
	private int wdays;
	private int wphr;

	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int id, String name, int age, int salaries, String standard, int wdays, int wphr) {
		super(id, name, age, salaries);
		this.standard = standard;
		this.wdays = wdays;
		this.wphr = wphr;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getWdays() {
		return wdays;
	}

	public void setWdays(int wdays) {
		this.wdays = wdays;
	}

	public int getWphr() {
		return wphr;
	}

	public void setWphr(int wphr) {
		this.wphr = wphr;
	}

	public void setWphr(double h) {
		if (h > 148)
			this.wphr = 7;
		else if (h > 72)
			this.wphr = 3;
		else if (h > 48)
			this.wphr = 2;
		else
			this.wphr = 1;

	}

	@Override
	public String toString() {
		return "HourlyEmployee [ standard=" + standard + ",wdays=" + wdays + ", wphr=" + wphr + "days]";
	}

}
