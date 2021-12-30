package com.aaludrajavabasicprograms;

public class GenericBoundExample<T extends Number> {
	T t;
	public GenericBoundExample(T t) {
	this.t=t;
	}
	
public void show() {
	System.out.println("The value is " +t.getClass().getName());
	System.out.println("value is" +t);
}
}