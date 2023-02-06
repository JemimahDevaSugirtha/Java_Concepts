package com.Pattern_Programming;

import java.util.Scanner;

public class Right_Pascal_Pattern2 {
	public static void main(String[] args) {
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		r = sc.nextInt();
		
		for (int i = 5; i<r+1; i++) {
			
			for (int k = 5; k<=i; k++) {
				System.out.print(k+" ");
				
			}
			System.out.println();
			
		}

		for (int i = 5; i<=r-1; i++) {
			
			for (int k = 5; k<=((r+4)-i); k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
