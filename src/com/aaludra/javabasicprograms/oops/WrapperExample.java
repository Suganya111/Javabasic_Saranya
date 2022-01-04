package com.aaludra.javabasicprograms.oops;

public class WrapperExample {
	public static void main(String args[]) {
	byte b=10;
	short s=20;
	double d=30.0D;
	float f=40.0F;
	int i=50;
	char c='a';
	boolean b1=true;
	long l=60;
	//primitive to object
	Byte byteobj=b;
	Short shortobj=s;
	Double doubleobj=d;
	Float floatobj=f;
	Integer intobj=i;
	Character charobj=c;
	Boolean booleanobj=b1;
	Long longobj=l;
	//printing the object values
	System.out.println("printing object values");
	System.out.println("Byte object: "+byteobj);
	System.out.println("Short object:"+shortobj);
	System.out.println("Double object:"+doubleobj);
	System.out.println("Float object:"+floatobj);
	System.out.println("Long object:"+longobj);
	System.out.println("Character object:"+charobj);
	System.out.println("Boolean object:"+booleanobj);
	System.out.println("Integer object:"+intobj);
	
	byte bytevalue=byteobj;
	int intvalue=intobj;
	short shortvalue=shortobj;
	double doublevalue=doubleobj;
	char charvalue=charobj;
	long longvalue=longobj;
	boolean booleanvalue=booleanobj;
	float floatvalue=floatobj;
	
	System.out.println("bytevalue:"+bytevalue);
	System.out.println("intvalue:"+intvalue);
	System.out.println("floatvalue:"+floatvalue);
	System.out.println("shortvalue:"+shortvalue);
	System.out.println("charvalue:"+charvalue);
	System.out.println("longvalue:"+longvalue);
	System.out.println("booleanvalue:"+booleanvalue);
	System.out.println("doublevalue:"+doublevalue);
	}
}
	
	
	

