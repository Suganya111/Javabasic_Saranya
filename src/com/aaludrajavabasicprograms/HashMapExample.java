package com.aaludrajavabasicprograms;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

	public static void main(String[] args) {
 HashMap<Integer,String> hm=new HashMap<Integer,String>();
 hm.put(1,"ThrowBall");
 hm.put(2,"Cricket");
 hm.put(3,"VollyBall");
 hm.put(4, "Hockky");
 System.out.println(hm);
System.out.println(hm.get(1));
System.out.println(hm.keySet());
System.out.println(hm.containsKey(2));
 System.out.println(hm.replace(4, "Kabadi"));
 System.out.println(hm);

System.out.println(hm.entrySet());
System.out.println(" ");
for(Map.Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+" " +m.getValue()+" ");
	
	
}
	 
	}
}
 
 
 
 
 
 

	

