package com.aaludra.javabasicprograms;

import java.util.Scanner;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		int a[]=new int[4];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();}
		for(int j=0;j<a.length;j++)
		{			
			System.out.print(a[j]+" ");
	
}


	}

}
