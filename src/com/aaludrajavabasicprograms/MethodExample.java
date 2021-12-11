package com.aaludrajavabasicprograms;

public class MethodExample {//use CamelCase
	public int addNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String args[]) {
		int num1 = 20;
		int num2 = 15;
		MethodExample obj = new MethodExample();
		int result = obj.addNumber(num1, num2);
		System.out.println("sum is:" + result);
	}
}
