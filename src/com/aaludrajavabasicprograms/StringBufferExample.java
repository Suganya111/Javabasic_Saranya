package com.aaludrajavabasicprograms;

public class StringBufferExample {
public static void main(String args[]) {
	StringBuffer sb=new StringBuffer();
	sb=new StringBuffer("welcome");
	System.out.println(sb.append(" "));
	System.out.println(sb.charAt(4));
	System.out.println(sb.length());
	System.out.println(sb.charAt(6));
	System.out.println(sb.capacity());
	System.out.println(sb.substring(2, 4));
	System.out.println(sb.delete(1, 3));
	System.out.println(sb.replace(1, 2, "hello"));
	System.out.println(sb.insert(2, "java"));
	//System.out.println(sb.append("java"));
	//sSystem.out.println(sb.reverse());
}
}
