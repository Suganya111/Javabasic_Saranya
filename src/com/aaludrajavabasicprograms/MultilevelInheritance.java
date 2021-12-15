package com.aaludrajavabasicprograms;

public class MultilevelInheritance {
	private String name;
	MultilevelInheritance(String s){
		setName(s);
	}
	public void setName(String s) {
	name=s;
	}
public String getName() {
	return name;
}
public void disply() {
	System.out.println("Name of the person =" +name);
}
}
