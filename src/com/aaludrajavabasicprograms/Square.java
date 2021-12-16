package com.aaludrajavabasicprograms;

public class Square extends AbstractShape {

	@Override
	double getperimeter(double d) {
		double perimeter = d*d;
		return perimeter;
	}

	@Override
	double getarea(double d) {
		double area = 4*d;
		// TODO Auto-generated method stub
		return area;
	}
}
	