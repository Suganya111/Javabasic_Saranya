package com.aaludrajavabasicprograms;

public class MultilevelInheritance1 extends MultilevelInheritance {
private int id;{
	
}
	MultilevelInheritance1(String name,int id) {
		super(name);
		setId(id);
			
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		
	}
		public void display() {
			super.disply();
			System.out.println("id= " +id);
			
		}
	}
		
	