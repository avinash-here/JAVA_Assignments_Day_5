package com.q1;

public class Employee {
	
	private int employeeID;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public void calculateNetSalary(int pfPercentage) {
		
		int netValue = 100-pfPercentage;
		this.netSalary = salary*netValue/100;
		
	}

}


