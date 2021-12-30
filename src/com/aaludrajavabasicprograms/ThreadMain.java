package com.aaludrajavabasicprograms;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		ThreadExample obj=new ThreadExample();
		ThreadExampleOdd obj1=new ThreadExampleOdd();
		
//obj.print();
		
obj1.start();
obj.start();
if(obj.isAlive()){
	System.out.println("Still excuting");
}
obj1.join();
obj.join();

if(obj.isAlive()){
	System.out.println("Still excuting");
}
System.out.println("bye...");
	}

}
