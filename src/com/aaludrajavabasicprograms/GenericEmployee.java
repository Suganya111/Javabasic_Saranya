package com.aaludrajavabasicprograms;

public class GenericEmployee {
private int id;
private String name;
private double salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "GenericEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
