package com.aaludra.javabasicprograms.oops;

public class Square extends AbstractShape {

	@Override
	double getperimeter(double d) {
		double perimeter = d*d;
		return perimeter;
	}

	@Override
	double getarea(double d) {
		double area = 4*d;

		return area;
	}
}
	