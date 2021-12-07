package com.aaludrajavabasicprograms;

import java.util.Scanner;

public class ClassExample {
	Scanner sc=new Scanner(System.in);
	public void getInput()
	
	{

	System.out.println("Enter the student name :");
	String name=sc.next();
	
	System.out.println("Enter the Student Id  :");
	int id=sc.nextInt();
	System.out.println("Student name is:"+name);
	System.out.println("Student Id is:"+id);
	
	}
	public static void main (String args[]) {
		
		ClassExample student=new ClassExample();
		student.getInput();
	
		
		
	}
			

}
