package com.aaludrajavabasicprograms;

public class TypesOfVariable {
	public static int staticvariable=20;
	int instancevariable=8;
	
	public void printValue() {
		int localvariable=5;
		System.out.println("the value of staticvariable /t" +staticvariable);
		System.out.println("the value of instancevariable /t" +instancevariable);
		System.out.println("the value of localvariable /t" +localvariable);
		
	}
public static void main(String args[]) {
	TypesOfVariable object=new TypesOfVariable();
	object.printValue();
}
}
