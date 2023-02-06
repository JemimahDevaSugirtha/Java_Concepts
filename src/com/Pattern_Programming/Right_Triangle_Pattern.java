package com.Pattern_Programming;
import java.util.Scanner;

public class Right_Triangle_Pattern {
	public static void main(String[] args) {
		int i,j,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		r = sc.nextInt();
		
		for (i = 0; i<=r; i++) {
			
			for (j = 0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
