package com.aaludra.javabasicprograms.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationExample {
	public static void main(String args[]) throws IOException  {
	
		try {
			FileInputStream filein=new FileInputStream("E:\\New folder\\first.txt");
			ObjectInputStream in=new ObjectInputStream(filein);
			SerilizationExample obj = (SerilizationExample) in.readObject();
			System.out.println("Name:" +obj.name);
			System.out.println("Age: " +obj.age);
			System.out.println("Address: " +obj.address);
				in.close();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
}
}
	
	
	

		
	

