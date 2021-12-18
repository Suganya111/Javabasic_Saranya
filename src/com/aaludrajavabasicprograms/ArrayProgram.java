package com.aaludrajavabasicprograms;

public class ArrayProgram {
	public static void main(String[] args) {
		String[] myarray = { "a", "y", "n", "a", "r", "a", "s" };
		for (int i = myarray.length - 1; i >= 0; i--) {
			System.out.print(myarray[i]);
		}
	}
}
