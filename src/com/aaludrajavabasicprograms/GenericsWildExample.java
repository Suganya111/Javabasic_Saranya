package com.aaludrajavabasicprograms;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildExample {
	public void show(ArrayList<?> l1) {
		System.out.println(l1);
	}
	public static void main(String args[]) {
		GenericsWildExample obj=new GenericsWildExample();
		ArrayList<Integer> l1 =new ArrayList <Integer>();
			l1.add(10);
			l1.add(12);
			l1.add(14);
			ArrayList<String> l2 =new ArrayList <String>();
			l2.add("hi");
			l2.add("hello");
			l2.add("hai");
			obj.show(l1);
			obj.show(l2);
			
			
		}
	}

	