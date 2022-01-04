package com.aaludra.javabasicprograms.inheritance;

//id declaration we don't need {} braces
//class name must be changed
//Set method inside constructor is not needed, 
public class MultilevelInheritance1 extends MultilevelInheritanceExample {
private int id;{
	
}
	MultilevelInheritance1(String name,int id) {
		//super(name);
		setId(id);
			
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		
	}
		public void display() {
			//super.disply();
			System.out.println("id= " +id);
			
		}
	}
		
	