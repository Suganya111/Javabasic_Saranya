
package com.aaludra.javabasicprograms.exception;

import java.util.Scanner;

public class ExceptionExample {
	public void exception() {
			Scanner in=new Scanner(System.in);
				try {
					System.out.println("Enter the number1");
					int num1=in.nextInt();
					System.out.println("Enter the number2");
					int num2=in.nextInt();
					in.close();
					int result=num1/num2;
					System.out.println(result);
				}
				catch(Exception e) {
					System.out.println(e);
				}finally {
					System.out.println("bye");
				}
		}
	public void nullPointer() {
		try {
			String str=null;
			System.out.println(str.length());
		}
	catch(Exception e) {
		System.out.println(e);
			
			}
			
		}
	public void numberFormat() {
		try {
		String s="sai";
		int i=Integer.parseInt(s);
	} 
		catch(Exception e)
		{
		System.out.println(e);
		}
		
	}
	public void arrayException() {
		try {
			int a[]=new int[10];
			a[15]=1;
		}
		catch(Exception e) {
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();
		//obj.exception();
		//obj.nullPointer();
		//obj.numberFormat();
		//obj.numberFormat();
		obj.arrayException();
	}
	}

		
	
