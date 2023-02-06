package com.loops;

public class Do_While_Loop {
	
	public static void main(String[] args) {
		int i=0,j,row=6;
		
		do {
			System.out.println("*");
			
			for (j = 0; j <=i; j++) {
				
				System.out.print("*");	
			}	
			
			i++;
		} while (i<row-1);
		System.out.println("*");
	}

}
