package com.aaludrajavabasicprograms;

enum Season {
	WINTER, SUMMER, SPRING, FALL, AUTUMN
}

public class EnumExample {
	Season s;

	public EnumExample(Season s) {
		this.s = s;
	}

	public void season() {
		switch (s) {
		case WINTER:
			System.out.println("this is winter season");
			break;
		case SUMMER:
			System.out.println("this is summer season");
			break;
		case SPRING:
			System.out.println("this is spring season");
			break;
		case AUTUMN:
			System.out.println("this is autumn seson");
			break;
		case FALL:
			System.out.println("this is fall season");
			break;
		default:
			System.out.println("invalid");
			break;
		}
	}

	public static void main(String args[]) {

		String str = "FALL";
		EnumExample obj = new EnumExample(Season.valueOf(str));
		obj.season();

	}
}
