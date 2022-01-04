package com.aaludra.javabasicprograms;

public class ArrayDemo {

	
		public void oned() {
		int a[]=new int[4];
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		for(int i=1;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}
		public void twod() {
			int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
			int b[][]= {{1,3,5},{2,4,6},{7,9,11}};
			int c[][]=new int[3][3];
			System.out.println();
			for(int i=0;i<3;i++) 
			{
				for(int j=0;j<3;j++) {
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
			System.out.println();					
				}
			}
		public static void main(String args[]) {
			ArrayDemo obj=new ArrayDemo();
			obj.oned();
			obj.twod();
		}

}
