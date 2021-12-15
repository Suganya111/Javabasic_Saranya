package com.aaludrajavabasicprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String args[]) {
		ArrayList<String>cityNames=new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("Karnataka");
		cityNames.add("Mumbai");
		cityNames.add("Andhra");
	
	
	Iterator<String> iterator=cityNames.iterator();
	System.out.println("cityNames elements:");
	while(iterator.hasNext())
		System.out.println(iterator.next()+" ");
}
}

