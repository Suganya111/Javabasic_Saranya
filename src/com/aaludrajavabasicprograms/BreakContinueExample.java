package com.aaludrajavabasicprograms;

public class BreakContinueExample {
	public static void main(String args[]) {
		for (int i = 1; i <= 10; i++) {
			// if the number is 5 loop is terminated

			if (i == 5)
				break;
			System.out.println("i:" + i);
		}
		System.out.println("out of loop");

		for (int i = 1; i <= 10; i++) {
			// If the number is 2
			// skip and continue
			if (i == 2)
				continue;
			System.out.println(i + " ");
		}
	}
}
