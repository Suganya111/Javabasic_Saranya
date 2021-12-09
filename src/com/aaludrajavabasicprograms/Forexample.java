package com.aaludrajavabasicprograms;

public class Forexample {
	public static void main(String args[]) {

		for (int i = 10; i >= 1; i--) {
			for (int j = 10; j >= i; j--) {
				if (i == 7) {
					System.out.println();
				} else
					System.out.print(" "+i);
			}
			System.out.println();
		}

	}
}
