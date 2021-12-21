package com.aaludrajavabasicprograms;

public class ThrowExceptionExample {
	public void vote(int age) {
		if(age<18) 
			throw new ArithmeticException("Not eligible for voting");
			else
			{
				System.out.println("eligible for voting");
			}
		}
	public static void main(String args[])
	{
		ThrowExceptionExample obj=new ThrowExceptionExample();
		obj.vote(20);
	}
	}


