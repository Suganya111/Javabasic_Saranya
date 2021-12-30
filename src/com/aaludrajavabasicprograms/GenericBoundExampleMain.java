package com.aaludrajavabasicprograms;

public class GenericBoundExampleMain {
	

	    public static void main(String[] args) {
	        GenericBoundExample<Integer> integerBox = new GenericBoundExample<Integer>(10);
	       integerBox.show();
	       GenericBoundExample<Double> doubleBox = new GenericBoundExample<Double>(10.0);
	       doubleBox.show();
	       
	    }
}
	       
	   