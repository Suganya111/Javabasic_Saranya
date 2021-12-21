package com.aaludrajavabasicprograms;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String args[]) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Apple");
	al.add("Banana");
	al.add("Mango");
	System.out.println(al);
	al.add("Grapes");
	System.out.println(al);
	System.out.println(al.get(1));
	System.out.println(al.remove(2));
	System.out.println(al.indexOf("Apple"));
	System.out.println(al.size());
	
	}
	
	
	

}
