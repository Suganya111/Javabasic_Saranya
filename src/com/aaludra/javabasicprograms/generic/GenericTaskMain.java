package com.aaludra.javabasicprograms.generic;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class GenericTaskMain {
	public static void printListObject(List<?> list) {
		for (Object element : list) {
			System.out.print(element + " ");
		}
	}
	//Iterator itr=ll.iterator();
	/*for (Iterator i = ll.iterator(); i.hasNext(); ) 
	       System.out.println(i.next());*/

	public static void main(String args[]) {
		GenericTaskStudent obj = new GenericTaskStudent();
		System.out.println("Student Details: ");
		List<GenericTaskStudent> ll = new LinkedList<GenericTaskStudent>();
		obj.setId(1);
		obj.setName("sai");
		obj.setMark(1.1);
		ll.add(obj);
		printListObject(ll);
		System.out.println(" ");
		GenericEmployee obj1 = new GenericEmployee();
		System.out.println("Employee details: ");
		List<GenericEmployee> l1 = new LinkedList<GenericEmployee>();
		obj1.setId(1);
		obj1.setName("varun");
		obj1.setSalary(2.2);
		l1.add(obj1);
		printListObject(l1);
		System.out.println(" ");
		GenericUser obj2=new GenericUser(); 
		System.out.println("User Details: ");
		List<GenericUser> l2 = new LinkedList<GenericUser>();
		obj2.setName("arun");
		obj2.setId(1);
		obj2.setEmail("saran09@gmail.com");
		l2.add(obj2);
		printListObject(l2);
		System.out.println(" ");
	}
}

		