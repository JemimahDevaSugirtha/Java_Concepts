package com.Pattern_Programming;

import java.util.Scanner;

public class Hollow_Triangle_Pattern {
	public static void main(String[] args) {
		int i,j,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		r = sc.nextInt();
		
		for (i = 0; i<=r; i++) {
			for (j = r-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k<=i-1; k++) {
				
				if (k==0 ||i==r ||k==i-1) {
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
