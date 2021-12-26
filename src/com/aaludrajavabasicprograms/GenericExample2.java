package com.aaludrajavabasicprograms;

public class GenericExample2<T> {
	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}

public static void main(String args[]) {
	GenericExample2<Integer> IntegerGenericExample2=new GenericExample2<Integer>();
	GenericExample2<String>StringGenericExample2=new GenericExample2<String>();
	IntegerGenericExample2.add(10);
	StringGenericExample2.add("Hello");
	System.out.printf("Integer Value %d\n", IntegerGenericExample2.get());
    System.out.printf("String Value %s\n",StringGenericExample2.get());
 }
}
	
	

	
	