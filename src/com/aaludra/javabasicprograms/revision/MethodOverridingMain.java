package com.aaludra.javabasicprograms.revision;

public class MethodOverridingMain extends MethodOverridingExample {
	public void show(int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		MethodOverridingExample obj=new MethodOverridingExample();
		obj.show(1);
		MethodOverridingMain obj1=new MethodOverridingMain();
		obj1.show(2);

	}

}
