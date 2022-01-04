package com.aaludra.javabasicprograms.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String args[]) {
		 LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
		 {
			 lhm.put(2, "Amzath");
			 lhm.put(1, "Viji");
			 lhm.put(3, "Saran");
			 lhm.put(5, "Anu");
			 System.out.println(lhm);
			 System.out.println(lhm.containsKey(2));
			 System.out.println(lhm.entrySet());
			 lhm.replace(1,"Surya");
			 System.out.println(lhm);
			 System.out.println(lhm.size());	
			 System.out.println(lhm.values());
			 System.out.println(lhm.keySet());
			 
			 
			  
		 }
	}
}
