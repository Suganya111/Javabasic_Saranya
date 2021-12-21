package com.aaludrajavabasicprograms;

public class CustomExceptionExample1 {
	void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("age is invalid");
		}
	}

	public static void main(String args[]) {
		CustomExceptionExample1 obj = new CustomExceptionExample1();
		try {
			obj.checkAge(17 );
		} catch (InvalidAgeException e) {
			System.out.println("Caught the Exception");
			System.out.println(e.getMessage());
		}
	}
}
