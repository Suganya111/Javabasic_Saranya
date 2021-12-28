package com.aaludrajavabasicprograms;

public class MultiThreadDemoMain extends Thread {
	public void run() {
		for(int i=0;i<3;i++) 
			System.out.println(Thread.currentThread());
		}
	
	public static void main(String args[]) {
		MultiThreadDemoMain t1=new MultiThreadDemoMain();
		MultiThreadDemoMain t2=new
	}
}
	