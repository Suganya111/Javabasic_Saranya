package com.aaludra.javabasicprograms.multithread;

public class Table {
	/* synchronized  static void printTable(int n)---->static synchronization
	(no need constructor,no need to passing object,no need to create obj)
	*/
	 synchronized  void printTable(int n) {
		 //synchronized(this)--->synchronized block
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	 
		 
	 }


