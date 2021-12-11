package com.aaludrajavabasicprograms;

public class ModifiersExample {
	private int empsalary = 200; // can be access only in this class
	public String empname = "Saranya";// can accessed anywhere in the class and package
	protected int empid = 41;// can be accessed anywhere in the same package and also access able
// if only if it is a sub class of other package class

	public void employeedetails() {
		System.out.println("employee details");
		System.out.println("employee name:" + empname);
		System.out.println("empid:" + empid);
		System.out.println("empsalary:" + empsalary);
	}

	public static void main(String args[]) {
		ModifiersExample obj = new ModifiersExample();
		obj.employeedetails();
	}
}
