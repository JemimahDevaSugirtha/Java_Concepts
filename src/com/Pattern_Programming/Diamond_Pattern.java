package com.Pattern_Programming;

import java.util.Scanner;

public class Diamond_Pattern {
	public static void main(String[] args) {
		int i,j,r,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		r = sc.nextInt();
		
		for (i = 0; i<r; i++) {
			for (j = r-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		s=1;
		for (i = 1; i<=r-1; i++) {
			for (j = 1; j<=s; j++) {
				System.out.print(" ");
			}
			s++;
			System.out.print(" ");
			for (int k = 1; k<=(r-j)+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
