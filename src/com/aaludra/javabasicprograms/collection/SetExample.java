package com.aaludra.javabasicprograms.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();{
			set.add("monday");
			set.add("tuesday");
			set.add("wednesday");
			set.add("tuesday");
			System.out.println(set);
			System.out.println(set.size());
			set.remove("monday");
			System.out.println("after removing"+set);
			set.clear();
			System.out.println("after clear"+set);
			//System.out.println(set.hashCode());
			
		}


	}

}
