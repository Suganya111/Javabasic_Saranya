package com.aaludrajavabasicprograms;

public class ForExample {
	public static void main(String args[]) {

		for (int i = 10; i >= 1; i--) {
			for (int j = 10; j >= i; j--) {
				if (i == 7) {
					continue;//unwanted spaces are printed.... put continue;
				} else
					System.out.print(" "+i);
			}
			System.out.println();
		}

	}
}
