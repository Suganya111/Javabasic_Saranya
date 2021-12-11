package com.aaludrajavabasicprograms;

public class EncapsulationProgramExample {
	private String name;
	private int age;
	private int id;

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int newage) {
		age = newage;
	}

	public void setName(String newname) {
		name = newname;
	}

	public void setId(int newid) {
		id = newid;
	}
}
