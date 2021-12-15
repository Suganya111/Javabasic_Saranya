package com.aaludrajavabasicprograms;

public class TamilNadu  extends AbstractExample {
	public void culture() {
		System.out.println("Tamil nadu culture");
	}
public static void main(String args[]) {
	AbstractExample obj=new TamilNadu();
	obj=new TamilNadu();
	obj.breakfast();
	obj.pancard();
	obj.voteid();
	/*TamilNadu obj1=new TamilNadu();
	obj1.culture();*/
}
@Override
void breakfast() {
	System.out.println("Idly");
	// TODO Auto-generated method stub
	
}
}
