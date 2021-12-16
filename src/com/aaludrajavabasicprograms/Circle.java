package com.aaludrajavabasicprograms;

public class Circle extends AbstractShape  {

	@Override
	double getperimeter(double d) {
		double perimeter=2* Math.PI *d;
		return perimeter;
	}

	@Override
	double getarea(double d) {
		 
		double area = Math.PI*d*d ;
		return area;  
	}
	
}