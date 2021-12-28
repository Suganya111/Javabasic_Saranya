package com.aaludrajavabasicprograms;

public class ThreadExample extends Thread{
	
	public void run() {
		 for(int i=0;i<=10;i+=2) {
			 System.out.println(i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}

}}
