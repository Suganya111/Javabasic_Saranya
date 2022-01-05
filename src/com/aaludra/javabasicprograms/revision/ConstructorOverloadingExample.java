package com.aaludra.javabasicprograms.revision;

public class ConstructorOverloadingExample {
	int id,ph;
	String name,user;
     int salary;
	public ConstructorOverloadingExample(int id,String name) {
		this.id=id;
		this.name=name;
	}
public ConstructorOverloadingExample(int ph,String user,int salary) {
	this.ph=ph;
	this.user=user;
	this.salary=salary;
}
public void display() {
	
	System.out.println(" ph is "+ ph + " user is " + user + " salary is "+salary);
}
public void show() {
	System.out.println("name is "+ name +" id is "+ id );
	
}
public static void main(String args[]) {
	ConstructorOverloadingExample obj=new ConstructorOverloadingExample(1,"arun");
	ConstructorOverloadingExample obj1=new ConstructorOverloadingExample(813025,"saranya",22000);
	obj.show();
	obj1.display();
	
}
}
