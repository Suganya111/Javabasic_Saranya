package com.aaludrajavabasicprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	public void hash() {
		HashSet<Integer> hs=new HashSet<Integer>();{
			hs.add(8);
			hs.add(0);
			hs.add(10);
			hs.add(7);
			hs.add(1);
			hs.add(1);
			System.out.println(hs);
			Iterator<Integer> itr=hs.iterator();
			while(itr.hasNext())
			System.out.println(itr.next());
			System.out.println(hs.size());
			System.out.println("");
			}
	}
		public void linkedHash() {
		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		{
			lhs.add(9);
			lhs.add(4);
			lhs.add(1);
			lhs.add(1);
			lhs.add(3);
		System.out.println(lhs);
		System.out.println("");
		}
		}
	
		public void treeSet() {
			TreeSet<String>ts=new TreeSet<String>();{
				ts.add("B");
				ts.add("D");
				ts.add("A");
				ts.add("F");
				ts.add("B");
				System.out.println(ts);
				System.out.println(ts.last());
				
				Iterator<String> itr=ts.descendingIterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				
				
				
			}
		}
    public static void main(String args[]) {
	HashSetExample obj=new HashSetExample();
	obj.hash();
	obj.linkedHash();
	obj.treeSet();
}
	}
