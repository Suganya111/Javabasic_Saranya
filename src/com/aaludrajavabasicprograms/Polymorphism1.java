package com.aaludrajavabasicprograms;

//class name must be meaningful
public class Polymorphism1 extends PolymorphismExample {
	public void shape() {
		System.out.println("Circle");
	}

	public static void main(String args[]) {
		PolymorphismExample obj = new PolymorphismExample();
		{
			obj.shape();
			obj = new Polymorphism1();
			obj.shape();
		}
	}
}
