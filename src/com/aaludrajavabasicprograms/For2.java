package com.aaludrajavabasicprograms;

public class For2 extends ForInheritance {
	public void print(int a, int b) {
		this.i=a;
		this.j=b;

		
		 for ( i=a; a<=10; a++) {
			 for ( j=b; j<=a; j++) {
					//if (a == 7) {
						//continue;//unwanted spaces are printed.... put continue;
					//} else
						System.out.print(a);
				}
				System.out.println();
			}

		}
		
	}


