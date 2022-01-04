
package com.aaludra.javabasicprograms.oops;

abstract class AbstractShape {

	void shapes() {
		System.out.println("Find area and perimeter");
	}

	abstract double getarea(double d);

	abstract double getperimeter(double d);
}
