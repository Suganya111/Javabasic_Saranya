package com.aaludrajavabasicprograms;

public class Polymorphism1 extends Polymorphism {
public void shape() {
	System.out.println("Circle");
}
public static void main(String args[]) {
	Polymorphism obj=new Polymorphism();
	{
		obj.shape();
		obj=new Polymorphism1();
		obj.shape();
	}
}
}
