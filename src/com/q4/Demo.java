package com.q4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter the number of Students");
		int num = sc.nextInt();
		
		Student[] array = new Student[num];

		for(int i = 1; i <= num; i++) {

			System.out.println("Enter Student "+i+" Details");
			System.out.println();
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Roll");
			int roll = sc.nextInt();
			
			System.out.println("Enter Address");
			String add = sc.next();
			
			System.out.println("Enter Marks");
			int marks = sc.nextInt();
			
			System.out.println();
			
			Student s1 = new Student();
			s1.setAddress(add);
			s1.setMarks(marks);
			s1.setRoll(roll);
			s1.setName(name);
			
			array[i-1] = s1;
		}
		
		int sumOfMarks = 0;
		
		for(int j = 0; j < array.length; j++) {
			sumOfMarks += array[j].getMarks();
			
			System.out.println("Student "+ (j+1) + " Details :");
			
			System.out.println("Name : "+ array[j].getName());
			System.out.println("Roll : "+ array[j].getRoll());
			System.out.println("Address : "+ array[j].getAddress());
			System.out.println("Marks : "+ array[j].getMarks());
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Average of all the Students' marks : "+ (sumOfMarks/array.length));
	}

}
