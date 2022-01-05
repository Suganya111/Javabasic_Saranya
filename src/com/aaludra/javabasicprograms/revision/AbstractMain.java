package com.aaludra.javabasicprograms.revision;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractEmployeeExample obj=new AbstractEmployee1();
		obj.setName("sai");
		obj.setId(1);
		obj.salary();
		obj.employee();
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getsalary());

	}

}
