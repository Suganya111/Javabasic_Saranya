package com.aaludra.javabasicprograms;

public class SwitchExample {
	public static void main(String args[])
	{
		String Level="Expert";
		int level=0;
		switch(Level) {
		case "Beginner":level=1;
		case "Intermidiate":level=2;
		case "Expert":level=3;
		default:
			System.out.println("your level is "+level);
		
		
		}
	}
}
