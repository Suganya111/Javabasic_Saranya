package com.aaludrajavabasicprograms;

//instead of storing in result variable we can directly print it
public class MethodExample {//use CamelCase
	public int addNumber(int a, int b) {

		return a + b;
	}

	public static void main(String args[]) {
		int num1 = 20;
		int num2 = 15;
		MethodExample obj = new MethodExample();

		System.out.println("sum is:" + obj.addNumber(num1, num2));
	}
}
