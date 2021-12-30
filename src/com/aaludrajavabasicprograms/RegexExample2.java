package com.aaludrajavabasicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		String mobile="+91 6189870309";
		Pattern p=Pattern.compile("[+](0|91)?[_ ][6-9][0-9]{9}$");
		Matcher m=p.matcher(mobile);
	if(m.find()) {
		System.out.println(m.group() +"is valid mobile number");
	}else {
		System.out.println(mobile +"not valid mobile number");
	}
		
	}

}
