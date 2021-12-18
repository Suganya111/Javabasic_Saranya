package com.aaludrajavabasicprograms;

public class Circle extends AbstractShape  {

	@Override
	double getperimeter(double d) {

		return 2 * Math.PI * d;
	}

	@Override
	double getarea(double d) {
		 
		return Math.PI * d * d;
	}
	
}