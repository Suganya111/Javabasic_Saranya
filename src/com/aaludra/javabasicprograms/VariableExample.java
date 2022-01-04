package com.aaludra.javabasicprograms;

public class VariableExample {
	static int m=100; //static variable
	 int d=80;//instance variable
	/*A variable declared inside the class
	 but outside the body of the method,*/
	void variable() {
		int b =90;//local variable
	/*A variable declared inside the body of the method is 
		called local variable. You can use this variable only within that 
		method */
		int a=m+d+b;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		VariableExample obj=new VariableExample();
		obj.variable();
		
		}

}
