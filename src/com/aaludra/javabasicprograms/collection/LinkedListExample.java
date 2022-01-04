package com.aaludra.javabasicprograms.collection;

//import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[]) {
		LinkedList<String>ll = new LinkedList<String>();
		ll.add("sai");
		ll.add("shivan");
		ll.add("eshwaran");
		System.out.println(ll);
		ll.add(1, "Muruga");
		System.out.println("After adding"+ll);
		System.out.println(ll.get(2));
		ll.remove("sai");
		System.out.println("after removing"+ll);
		ll.offerFirst("god");
		System.out.println("after offer"+ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		
	}
}
		
		
		/*Iterator <String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
			
