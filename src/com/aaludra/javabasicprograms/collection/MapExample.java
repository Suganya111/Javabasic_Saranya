package com.aaludra.javabasicprograms.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String args[]) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1,"TamilNadu");
		map.put(2,"Kerala");
		map.put(3,"Selam");
		map.put(4,"Erode");
		System.out.println(map);
		Set set=map.entrySet();
		Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	        System.out.println(map.keySet());
	        System.out.println(map.containsValue("Kerala"));
	        System.out.println(map.get(1));
	        System.out.println(map.remove(1));
	        System.out.println(map);
	        System.out.println(map.replace(2, "Madurai"));
	        System.out.println(map);
	    }  
	
	
		
			
		}
		
		
		
		
	


