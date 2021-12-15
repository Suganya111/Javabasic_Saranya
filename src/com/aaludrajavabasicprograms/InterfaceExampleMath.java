package com.aaludrajavabasicprograms;

public class InterfaceExampleMath implements InterfaceExample {

	@Override
	public void shape() {
		System.out.println("Cube");
		
	}

	@Override
	public void colour() {
		System.out.println("Blue");
		
	}
	public static void main(String args[]) {
		InterfaceExample obj=new InterfaceExampleMath();
		obj.shape();
		obj.colour();
	}
	}


