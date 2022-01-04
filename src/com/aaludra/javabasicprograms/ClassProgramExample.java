package com.aaludra.javabasicprograms;

import java.util.Scanner;

public class ClassProgramExample {
	Scanner sc = new Scanner(System.in);

	public void getInput()

	{

		System.out.println("Enter the student name :");
		String name = sc.next();

		System.out.println("Enter the Student Id  :");
		int id = sc.nextInt();
		sc.close();// close the Scanner
		System.out.println("Student name is:" + name);
		System.out.println("Student Id is:" + id);

	}

	public static void main(String args[]) {

		ClassProgramExample student = new ClassProgramExample();
		student.getInput();
	}

}
