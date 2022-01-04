package com.aaludra.javabasicprograms;

public class BreakContinueExample {
	public static void main(String args[]) {
		for (int i = 1; i <= 10; i++) {


			if (i == 5)
				break;
			System.out.println("i:" + i);
		}
		System.out.println("out of loop");

		for (int i = 1; i <= 10; i++) {

			if (i == 2)
				continue;
			System.out.println(i + " ");
		}
	}
}
