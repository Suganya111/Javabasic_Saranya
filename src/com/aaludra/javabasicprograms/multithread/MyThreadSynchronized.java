package com.aaludra.javabasicprograms.multithread;

public class MyThreadSynchronized extends Thread {
	Table t;
	MyThreadSynchronized(Table t){
		this.t=t;
		
	}
	public void run() {
		t.printTable(2);
	}


public static void main(String rgs[]) {
	Table obj=new Table();
	MyThreadSynchronized t1=new MyThreadSynchronized(obj);
	t1.start();
}}
