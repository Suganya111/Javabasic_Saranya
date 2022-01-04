package com.aaludra.javabasicprograms.string;

public class StringExample {

	public static void main(String[] args) {
		String s=new String("java");
		String name="sai";
		String s1=new String("String");
		System.out.println(s);//creating Java string by new keyword
		//char[] ch= {'j','a','v','a'};
		//System.out.println(ch);//converting char array to string    
		char ch=s.charAt(1);//returns the char value at the 4th index  
		System.out.println(ch);
        System.out.println(s.concat(" is programing language"));
        System.out.println(s.equals(s1));
        System.out.println(name.formatted("name is %s " +name));
        /*byte[] b = s1.getBytes();
        for(int i=0;i<b.length;i++){  
            System.out.println(b[i]); */ 
        //String s2 = new String(b);  
        //System.out.println(s2);  
           String s3=s1.intern();
           System.out.println(s1==s);
           int value=10;
           String b=String.valueOf(value);
           System.out.println(b+90);
           String date=String.join("/", "1","1","2022");
           System.out.println(date);
           
	}
;
}
