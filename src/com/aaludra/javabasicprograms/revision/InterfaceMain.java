package com.aaludra.javabasicprograms.revision;

public class InterfaceMain implements InterfaceExample {


	@Override
	public void calculation(int a, int b) {
	System.out.println("calculation: " + (a*b));
		
	}

	@Override
	public void area(int length, int width) {
		System.out.println("area of rectangle: " + (length*width));
		
	}
	public static void main(String[] args) {
		InterfaceMain obj=new InterfaceMain();
		obj.area(8, 10);
		obj.calculation(9, 10);
	}

}
