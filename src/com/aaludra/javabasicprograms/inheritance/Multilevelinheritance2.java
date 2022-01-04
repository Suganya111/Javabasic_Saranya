package com.aaludra.javabasicprograms.inheritance;

public class Multilevelinheritance2 extends MultilevelInheritance1 {
	private int days; 
	Multilevelinheritance2(int id,int days, String sname)
	{
		super(sname,id);
		this.days=days;
	}
	public void diplay() {
		super.display();
		System.out.println("no of days="+days);
	}
}
	