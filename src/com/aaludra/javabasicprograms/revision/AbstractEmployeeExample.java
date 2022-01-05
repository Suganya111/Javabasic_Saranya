package com.aaludra.javabasicprograms.revision;

public abstract class AbstractEmployeeExample {
	private String name;
	int id,salary;
	public void employee() {
		System.out.println("employee details");
	}
abstract void salary();
int getsalary() {
	return salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}
