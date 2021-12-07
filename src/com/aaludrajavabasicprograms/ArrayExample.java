package com.aaludrajavabasicprograms;

public class ArrayExample {
	public void print()
	{
	int a[]=new int[4];
	a[0]=10;
	a[1]=15;
	a[2]=20;
	a[3]=25;
	
	
for(int i=0;i<a.length;i++)
{ System.out.println(a[i]);
}System.out.println();
	}	
	
	public void add() {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]=new int[3];
		for(int i=0;i<3;i++) {
			
			c[i]=a[i]+b[i];
		}
		for(int j=0;j<3;j++) {
			System.out.print(c[j] + " ");
			}
		System.out.println();
	}
	public void addition() {
		int a[][]= {{1,2,3},{2,4,5},{1,1,2}};
		int b[][]= {{2,8,1},{1,1,1},{1,9,7}};
		int c[][]=new int[3][3];
		System.out.println();
		for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j] +" ");}
		System.out.println();
		}
			
		
		}
		
	
	public static void main(String args[]) {
		ArrayExample obj=new ArrayExample();
		
		obj.print();
		obj.add();
		obj.addition();
	}
	
		
	}

	