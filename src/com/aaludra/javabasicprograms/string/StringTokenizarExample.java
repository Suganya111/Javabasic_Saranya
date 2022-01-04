package com.aaludra.javabasicprograms.string;

//need formatting
//need to implement extra methods from String Tokenizer
import java.util.StringTokenizer;

public class StringTokenizarExample {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("welcome-to-java-programing", "-");

		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

		StringTokenizer st2 = new StringTokenizer("welcome,to,java,programing", "m");
		System.out.println("Next Token is:" + st2.nextToken());

		StringTokenizer st3 = new StringTokenizer("java is a programing language");
		System.out.println("Total Token is:" + st3.countTokens());
	}
}
