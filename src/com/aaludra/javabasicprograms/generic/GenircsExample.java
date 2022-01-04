package com.aaludra.javabasicprograms.generic;

public class GenircsExample {
	public static<E> void print (E[] inputArray) {
		for(E element: inputArray) {
			System.out.printf("%s",element);
			
		}
		System.out.println();
	}
public static void main(String args[]) {
	Integer[] intArray= {1, 2, 3, 4, 5};
	Double[] doubleArray= {1.1, 2.2, 3.3, 4.4};
	Character[] charArray= {'s','a','r','a'};
	System.out.println("\n intArray is");
	print(intArray);
	System.out.println("\n doubleArray is");
	print(doubleArray);
	System.out.println("\n charArray is");
	print(charArray);
}

	
}

