package com.aaludra.javabasicprograms.revision;

public class EncapsulationExampleMain {

	public static void main(String[] args) {
     EncapsulationExample obj=new EncapsulationExample();
     obj.setAccholdname("saranya");
     obj.setAccno(7560504000L);
     obj.setInterest(2002f);
     System.out.println("Name: " + obj.getAccholdname()); 
     System.out.println ("Account No: " + obj.getAccno()); 
     System.out.println( "Interest is: " + obj.getInterest());
	}

}
