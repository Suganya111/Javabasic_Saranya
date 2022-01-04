package com.aaludra.javabasicprograms;

//formatting is needed
public class WhileExample {
	public static void main(String[] args) {
	String[] myarr= {"a","y","n","r","a","s"};
	int i=myarr.length-1;
	while(i>=0) {
			
		if (myarr[i].equals("s") || myarr[i].equals("a") || myarr[i].equals("y")) {
			
	         System.out.print(myarr[i].toUpperCase());
	        
		}
	         else 
	         {
	      	System.out.print(myarr[i]);
	        }
			 i--;
	}
	}
}
