package com.aaludrajavabasicprograms;

public class StringExample {
	public static void main(String args[]) {
		String s1="Hello";
		String s2="World";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("string length is:" +s1.length());
		System.out.println("string length is:" +s2.length());
		String s3 =s1.concat(s2);
		System.out.println(s3);
		String s1lower=s1.toLowerCase();
		System.out.println(s1lower);
		String s2upper=s2.toUpperCase();
		System.out.println(s2upper);
		int index1=s1.indexOf("e");
		System.out.println(index1);
		System.out.println(s1.substring(1,3));
	}
}
