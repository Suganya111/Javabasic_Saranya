package com.aaludra.javabasicprograms.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListExample {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();	
		al.add("call");
		al.add("bat");
		al.add("fog");
		Collections.sort(al);
		for(String s:al)
		System.out.println(s);
		System.out.println("");
	ArrayList<Integer>al2=new ArrayList<Integer>();
	al2.add(10);
	al2.add(9);
	al2.add(8);
	al2.add(7);
	Collections.sort(al2);
	for(Integer n:al2)
		System.out.println(n);
	}

}
