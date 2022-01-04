package com.aaludra.javabasicprograms.oops;

public class TamilNadu  extends AbstractExample {
	public void culture() {
		System.out.println("Tamil nadu culture");
	}
public static void main(String args[]) {
	AbstractExample obj=new TamilNadu();
	obj=new TamilNadu();
	obj.breakFast();
	obj.panCard();
	obj.voteId();
	/*TamilNadu obj1=new TamilNadu();
	obj1.culture();*/
}
@Override
void breakFast() {
	System.out.println("Idly");
	// TODO Auto-generated method stub
	
}
}
