package com.aaludrajavabasicprograms;

public class AbstractMain {
	public static void main(String args[]) {
		AbstractShape obj2=new Circle();
			obj2.shapes();
		Square obj=new Square();
		System.out.println("area of square is:"+obj.getarea(2.1));
		System.out.println("perimeter of square is:"+obj.getperimeter(5.2));
		Circle obj1=new Circle();
		System.out.println("area of circle is:"+obj1.getarea(2.2));
		System.out.println("perimeter of circle is:"+obj1.getperimeter(1.1));
	}
}
		
		