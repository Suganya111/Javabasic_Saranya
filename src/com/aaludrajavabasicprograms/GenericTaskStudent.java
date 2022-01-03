package com.aaludrajavabasicprograms;

import java.util.Iterator;
import java.util.List;

public class GenericTaskStudent {
	private int id;
	private String name;
	private double mark;
  
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "GenericTaskStudent [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
	}


