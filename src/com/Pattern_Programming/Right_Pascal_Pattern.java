package com.Pattern_Programming;

import java.util.Scanner;

public class Right_Pascal_Pattern {
	public static void main(String[] args) {
		int i,r,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		r = sc.nextInt();
		
		for (i = 0; i<r; i++) {
			
			for (int k = 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		s=1;
		for (i = 1; i<=r-1; i++) {
			
			for (int k = 1; k<=(r-i); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
