package com.aaludra.javabasicprograms.oops;

//class name must be meaningful
public class Polymorphism1 extends PolymorphismExample1 {
	public void shape() {
		System.out.println("Circle");
	}

	public static void main(String args[]) {
		PolymorphismExample1 obj = new PolymorphismExample1();
		{
			obj.shape();
			obj = new Polymorphism1();
			obj.shape();
		}
	}
}
