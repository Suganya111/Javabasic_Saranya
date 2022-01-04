package com.aaludra.javabasicprograms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main (String args[]) {
		String str="Tamil is the oldest Language 1998";
		Pattern p=Pattern.compile("[0-9]");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.group()+"Start at"+m.start()+"Ends at"+m.end());
		}
		System.out.println(" ");
	Pattern p1=Pattern.compile("[A-Z]");
		Matcher m1=p1.matcher(str);
		while(m1.find()) {
			System.out.println(m1.group()+"Start at"+m1.start()+"Ends at"+m1.end());

	}
		System.out.println(" ");
		Pattern p2=Pattern.compile("[^is]");
		Matcher m2=p2.matcher(str);
		while(m2.find()) {
			System.out.println(m2.group()+"Start at"+m2.start()+"Ends at"+m2.end());

		}
		System.out.println(" ");
		Pattern p3=Pattern.compile("\\D");
		Matcher m3=p3.matcher(str);
		while(m3.find()) {
			System.out.println(m3.group()+"Start at"+m3.start()+"Ends at"+m3.end());

		}
		System.out.println(" ");
		Pattern p4=Pattern.compile("a{1}");
		Matcher m4=p4.matcher(str);
		while(m4.find()) {
			System.out.println(m4.group()+"Start at"+m4.start()+"Ends at"+m4.end());

		}



	}
}
