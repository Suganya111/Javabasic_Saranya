package com.aaludrajavabasicprograms;

public class CustomExceptionExample1 {
	int age;

	public CustomExceptionExample1(int age) {
		this.age = age;
	}

	public void checkAge() throws InvalidAgeException, InvalidException {
		if (age < 18 && age > 1) {
			throw new InvalidAgeException("age is invalid");
		} else if (age < 0) {
			throw new InvalidException("please check the age");
		} else {
			System.out.println("eligible");
		}
	}

	public static void main(String args[]) {
		CustomExceptionExample1 obj = new CustomExceptionExample1(-1);
		{

			try {
				
				obj.checkAge();
			 }catch (InvalidAgeException ae) {
			
				System.out.println(ae.getMessage());
			}catch(InvalidException ee) {
			
				System.out.println(ee.getMessage());
			}
			
			
					}
	}

}
