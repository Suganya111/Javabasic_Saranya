package com.aaludra.javabasicprograms.revision;

public class ConstructorExample {
	int id;
	String name;
	//creating a parameterized constructor  
	ConstructorExample(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("id is "+id +"name is " +name);
	}
	public static void main(String args[]) {
		 //creating objects and passing values  
		ConstructorExample obj=new ConstructorExample(1,"sai");
		ConstructorExample obj1=new ConstructorExample(2,"saran");
		//calling method to display the values of objec
		obj.display();
		obj1.display();
	}

		
	}


