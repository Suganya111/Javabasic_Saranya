package com.aaludrajavabasicprograms;

public class ConstructorExample 
{
	
	private String name;
	public ConstructorExample() {
	    System.out.println("Constructor Created:");
	    name = "Java";
	  }
public ConstructorExample(int i,int j) {
	System.out.println("Constructor with two parameter");
	 {
		
	}
	
}
	  public static void main(String[] args) {

	    
	    ConstructorExample obj = new ConstructorExample();
	    System.out.println("The name is " + obj.name);
	    ConstructorExample obj2=new ConstructorExample(5,5);
	    
	    
	  }
	 
	}