package com.aaludrajavabasicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample5 {
public static void main(String args[]) {
	String mobile="+1 (k86) 482 6615";
	//String mobile="+1 (202) 555 0125";
	//String regex=("^([+1])?([6-9]){3}[0-9]{3}[0-9]{4}$");
  //String regex=("[+][0-1][_ ](\\\\d{3}( )?)[0-9]{3}[_ ][0-9]{4}$");
//String regex=("^\(?\\d{3}\)?[-.\s]?\\d{3}[-.\s]?\\d{4}")
	String regex=("[+][1][_ ](\\((\\d{3})\\)) [_ ]?\\d{3}[_ ]?\\d{4}$");
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(mobile);
	if(m.find()) {
		System.out.println(m.group() + " is valid");
	}else {
		System.out.println(mobile + " not valid");
	}

	}
}
