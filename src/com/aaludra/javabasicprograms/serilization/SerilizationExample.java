package com.aaludra.javabasicprograms.serilization;

import java.io.*;

public class SerilizationExample implements Serializable {

	
	transient String name;
    int age;
	String address;

	public SerilizationExample(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public static void main(String args[]) throws IOException {
		SerilizationExample obj = new SerilizationExample("Saran", 20,"Coimbatore");
		try {
			FileOutputStream fileout = new FileOutputStream("E:\\New folder\\first.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(obj);
			out.close();
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*try {
			FileInputStream filein=new FileInputStream("E:\\New folder\\first.txt");
			ObjectInputStream in=new ObjectInputStream(filein);
			in.read();
			filein.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Name:" +obj.name);
		System.out.println("Age: " +obj.age);
		System.out.println("Address: " +obj.address);*/
		
	}
}
