package com.aaludra.javabasicprograms;

public class TypesOfVariableExample {
	public static int a=20;//use different type of variable names
	int i=8;
	
	public void printvalue() {
		int l=5;
		System.out.println("the value of staticvariable: " + a);
		System.out.println("the value of instancevariable: " + i);
		System.out.println("the value of localvariable: " + l);
		
	}
public static void main(String args[]) {
	TypesOfVariableExample object=new TypesOfVariableExample();
	object.printvalue();
}
}
