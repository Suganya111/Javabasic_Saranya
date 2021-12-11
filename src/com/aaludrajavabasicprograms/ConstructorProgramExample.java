package com.aaludrajavabasicprograms;

public class ConstructorProgramExample 
{
	
	private String name;
	public ConstructorProgramExample() {
	    System.out.println("Constructor Created:");
	    name = "Java";
	  }
public ConstructorProgramExample(int i,int j) {
	System.out.println("Constructor with two parameter");
	 {
		 System.out.println(i);//print parameter values here...
		 System.out.println(j);
	}
	
}
	  public static void main(String[] args) {

	    
	    ConstructorProgramExample obj = new ConstructorProgramExample();
	    System.out.println("The name is " + obj.name);
	    //ConstructorProgramExample obj2=new ConstructorProgramExample(5,5);
	    
	    
	  }
	 
	}