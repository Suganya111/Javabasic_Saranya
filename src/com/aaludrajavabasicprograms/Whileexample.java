package com.aaludrajavabasicprograms;

public class Whileexample {
	public static void main(String args[]) {
		int i,j,n=1;
		i=10;
		while(i>=n) {
			j=10;
			while(j>=i) {
				System.out.print(i);
				j--;
			}
			System.out.println(" ");
			i--;
			}
		}
}