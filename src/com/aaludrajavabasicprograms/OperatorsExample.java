package com.aaludrajavabasicprograms;

public class OperatorsExample {//use different type of class names ex:OperatorExample
	
	public void arithmatic()
	{
		int a=5;
		int b=4;
	System.out.println("Addition:"+a+b);// use some words inside of the print statement
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	}
	
	public void assignment()
	{
	int a=5;
	int b=4;
	System.out.println(a=b);
	System.out.println(a+=b);
	System.out.println(a-=b);
	System.out.println(a*=b);
	System.out.println(a/=b);
	System.out.println(a%=b);
	}
	public void relational()
	{
		int a=2;
		int b=6;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	public void logical()
	{
		int a=6;
		int b=8;
		System.out.println(a>5 && b<6);
		System.out.println(a<4 || b>8);
		System.out.println(!(a==b));
		System.out.println(!(a>b));
	}
	
	public void unary()
	{
		int a=9;
		int b=2;
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(a+b); //pre increment & decrement operator missing ex:++a,--a
		System.out.println(a-b);
		}
	public void bitwise() {
		int a=3;
		int b=4;
		System.out.println(a>2 & b<2);
		System.out.println("a^b="+(a^b));
		System.out.println("a|b="+(a|b));
		
	}
	public void shift() {
		int a=5;
		int b=7;
		System.out.println(a>>b);
		System.out.println(a<<b);
		}
	public void ternary() {
		int a=10;
		int b=12;
		
		System.out.println((a+b)>15?true:false);	
	}
	    public static void main (String args[]) {
		OperatorsExample op=new OperatorsExample();
		op.arithmatic();
		op.assignment();
	    op.relational();
	    op.logical();
	    op.unary();
	    op.bitwise();
	    op.shift();
	    op.ternary();
	}
}

