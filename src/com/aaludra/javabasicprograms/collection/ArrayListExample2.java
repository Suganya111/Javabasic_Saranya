
package com.aaludra.javabasicprograms.collection;
import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String args[]) {
		ArrayList<BookArray>al=new ArrayList<BookArray>();
		BookArray b1=new BookArray(1,2,"My Journey","Dr.A.P.J.Abdul Kalam");
		BookArray b2=new BookArray(2,3,"Cheque book","Vasdev Mohi");
		BookArray b3=new BookArray(3,4,"Politics of Opportunism","R P N Singh");
		al.add(b1);
		al.add(b2);
		al.add(b3);
		for(BookArray b:al) {
			System.out.println(b.id+" "+b.quanity+" "+b.name+" "+b.author+" ");
		}
	}
     
}
