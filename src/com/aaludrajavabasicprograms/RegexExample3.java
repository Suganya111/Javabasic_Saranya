package com.aaludrajavabasicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {
	//static boolean isValid(String email) {
		//String regex=("[a-zA-Z0-9]\\.");
	
public static void main(String args[]) {
	String email="saranya2809@gmail.com";
	//String regex="^[a-zA-Z+_.-]+@[a-zA-Z.-]+$";
	String regex="^[a-zA-Z+.-]+[0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z]+\\.)+[a-z" +
            "A-Z]{2,7}$";
            //String regex=("^[a-zA-Z0-9 .-_[^%#!$@]]+@[a-z.[a-z.]]{8,15}+$");
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(email);
	if(m.find()) {
		System.out.println(m.group() + " is valid email");
	}else {
		System.out.println(email + " not valid email");
	}
	
}
}
