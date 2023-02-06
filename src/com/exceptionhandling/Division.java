package com.exceptionhandling;
import java.util.*;
public class Division {
		private int divide(int a[]) throws ArithmeticException {
		int c = 1;
	
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0){
				throw new ArithmeticException();
				}else {
					c= c/a[i];
				}
		}return c;
	}	
	public static void main(String[] args) throws Exception_Handling{
		Scanner sc = new Scanner(System.in);
		Division t = new Division();
		
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
				System.out.println("\nCannot divide anything by zero!!\n");
				throw e;			
			}
		}	
		} catch (InputMismatchException e) {
			throw new Exception_Handling(1);			
		}finally {
			System.out.println("\nEND of calculation!!");
		}
	}	
}
