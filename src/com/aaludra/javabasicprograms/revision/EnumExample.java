package com.aaludra.javabasicprograms.revision;

public class EnumExample {
	public enum level{
		BEGINER(1),INTERMIDIATE(2),EXPERT(3);

		
		private int value;

		private level(int value) {
			this.value=value;
			
			
		}

		
	}
public static void main(String args[]) {
	for(level s:level.values()) {
		System.out.println(s);
	}
	System.out.println("value of BEGINER is " + level.valueOf("BEGINER"));
	System.out.println("value of INTERMIDIATE is " + level.valueOf("EXPERT").ordinal());
	System.out.println("value of EXPERT is: " + level.valueOf("EXPERT").value);
}
}
