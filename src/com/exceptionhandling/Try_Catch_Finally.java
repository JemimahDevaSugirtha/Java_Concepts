package com.exceptionhandling;

import java.util.Scanner;

public class Try_Catch_Finally {
	private int divide(int a[]) {
		int c = 1;
		for (int i = 0; i < a.length; i++) {
			c= c/a[i];
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Try_Catch_Finally t = new Try_Catch_Finally();
		
		try {
			System.out.println("Enter how many numbers need to be divided: ");
			int n = sc.nextInt();
			int j[] = new int[n];
			if (n<=1) {
				System.out.println("We need to have atleast 2 numbers to divide!!");
				}else {
			System.out.println("Enter the "+n+" numbers to be dvided: ");
			for (int i = 0; i < j.length; i++) {
				j[i] = sc.nextInt();
			}
			try {
				int A = t.divide(j);
				System.out.println("Division of above numbers is "+A);
			} catch(ArithmeticException e){
				System.out.println(e);
				System.out.println("Cannot divide anything by zero!!");
			}
		}	
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}finally {
			System.out.println("END of calculation!!");
		}
	}
}
