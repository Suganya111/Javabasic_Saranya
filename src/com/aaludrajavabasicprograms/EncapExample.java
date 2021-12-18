package com.aaludrajavabasicprograms;


public class EncapExample {

	public static void main(String[] args) {
		EncapsulationProgramExample obj=new EncapsulationProgramExample();
		obj.setAge(20);
		obj.setName("Saraa");
		obj.setId(1);
		System.out.println("Name:" +obj.getName()); 
		System.out.println("Age:" +obj.getAge()) ;
		System.out.println("Id:" +obj.getId());
		

	}

}
