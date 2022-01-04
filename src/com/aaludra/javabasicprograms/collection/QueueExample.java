package com.aaludra.javabasicprograms.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String args[]) {
		Queue<String> q=new PriorityQueue<String>();
		{
			q.add("Tamil");
			q.add("English");
			q.add("French");
			q.add("Kannada");
			q.add("Telugu");
			q.add("Hindi");
			System.out.println(q);
			q.remove("Tamil");
			System.out.println("After removing" +q);
		   q.poll();
		   System.out.println(q);
		   System.out.println(q.peek());
		   System.out.println(q.element());
		   System.out.println(" ");
		   Iterator<String> itr=q.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
			   
		   }
			
		}
	}

}
