package com.aaludra.javabasicprograms.multithread;

public class MyThreadSynchronized1 extends Thread {
	Table t;
	MyThreadSynchronized1(Table t){
		this.t=t;
		
	}
	public void run() {
		t.printTable(4);
	}


public static void main(String rgs[]) {
	Table obj=new Table();
	MyThreadSynchronized t1=new MyThreadSynchronized(obj);
	MyThreadSynchronized1 t2=new MyThreadSynchronized1(obj);
	t1.start();
	t2.start();
}
}
 
