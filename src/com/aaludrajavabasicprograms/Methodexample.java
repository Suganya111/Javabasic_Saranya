package com.aaludrajavabasicprograms;

public class Methodexample {
   public int addNumber(int a, int b) {
	   int sum=a+b;
	   return sum;
   }
 public static void main(String args[])
 {
	 int num1=20;
	 int num2=15;
 Methodexample obj=new Methodexample();
 int result=obj.addNumber(num1,num2);
 System.out.println("sum is:" +result);
 }
}
	 
	 
	 
 