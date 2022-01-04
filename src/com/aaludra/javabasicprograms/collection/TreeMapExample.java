package com.aaludra.javabasicprograms.collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		{
			tm.put(101,"SuperMan");
			tm.put(102, "IronMan");
			tm.put(103, "PowerMan");
			tm.put(104, "NinjaMan");
			System.out.println(tm);
			System.out.println(tm.firstEntry());
			System.out.println(tm.firstKey());
			System.out.println(tm.descendingMap());
			System.out.println(tm.size());
			System.out.println(tm.containsKey(101));
			System.out.println(tm.get(101));
			
		}


	}

}
