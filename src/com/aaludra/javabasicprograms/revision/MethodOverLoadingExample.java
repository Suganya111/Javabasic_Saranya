package com.aaludra.javabasicprograms.revision;

public class MethodOverLoadingExample {
	public void show() {
		System.out.println("No parameter");
	}
public void show(int a,int b) {
	System.out.println("sum of: " + (a+b));
}
public void show(int a,int b,double d)
{
	System.out.println("Multiply is: " + (a*b*d));
}

}
