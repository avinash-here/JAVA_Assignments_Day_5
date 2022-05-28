package com.q1;

import java.util.Scanner;

public class Main extends Employee{
	
	public static Employee getEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Salary");
		double slry = sc.nextDouble();
		System.out.println("Enter PF Percentage");
		int pfRate = sc.nextInt();
		
		Employee e1 = new Employee();
		e1.setEmployeeID(id);
		e1.setEmployeeName(name);
		e1.setSalary(slry);		
		e1.calculateNetSalary(pfRate);
		
		return e1;
		
	}
	
	public static void main(String[] args) {
		/*Employee e1 = new Employee();
		e1.setSalary(50000);
		e1.calculateNetSalary(12);
		double net = e1.getNetSalary();
		System.out.println("Net Salary is : "+net);*/
		
		Employee emp = getEmployeeDetails();
		
		System.out.println("Employee details : ");
		System.out.println("Employee ID : "+ emp.getEmployeeID());
		System.out.println("Name : "+ emp.getEmployeeName());
		System.out.println("Salary : "+ emp.getSalary());
		System.out.println("Net Salary : "+ emp.getNetSalary());
	}
}
