package com.loops;

public class While_Loop {
	
	public static void main(String[] args) {
		
		int i=0,j,row=6;
		while (i<row) {
			
			
			for (j = row-(i); j>1; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			i++;
		}
	}

}
