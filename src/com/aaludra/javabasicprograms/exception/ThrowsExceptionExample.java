package com.aaludra.javabasicprograms.exception;

import java.io.IOException;

public class ThrowsExceptionExample {
	public void show(int num) throws IOException, ClassNotFoundException {
		if(num==1) 
		{
			throw new IOException("it is Ioexception");
		}
		else
		{
			throw new ClassNotFoundException("class not found");
			
		}
}
	public static void main(String args[]) {
		ThrowsExceptionExample obj=new ThrowsExceptionExample();
		try {
			obj.show(2);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
			
		}
		


