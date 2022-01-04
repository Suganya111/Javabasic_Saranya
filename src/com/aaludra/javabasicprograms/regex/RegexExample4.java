package com.aaludra.javabasicprograms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample4 {
	public static void main(String args[]) {
String mobile="KM 173";
String regex=("^[A-Z _]{1,2} [0-9]{1,3}$");
Pattern p=Pattern.compile(regex);
Matcher m=p.matcher(mobile);
if(m.find()) {
	System.out.println(m.group() + " is valid");
}else {
	System.out.println(mobile + " not valid");
}

}
}
