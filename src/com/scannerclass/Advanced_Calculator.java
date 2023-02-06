package com.scannerclass;
import java.util.Scanner;

public class Advanced_Calculator {
	private void addition(int a, int b) {
		int c;
		c = a+b;
		System.out.println("ADDITION of "+a+"+"+b+"="+c);
	}
	private void subtraction(int a, int b) {
		int c;
		c = a-b;
		System.out.println("SUBTRACTION of "+a+"-"+b+"="+c);
	}
	private void multiplication(int a, int b) {
		int c;
		c = a*b;
		System.out.println("MULTIPLICATION of "+a+"*"+b+"="+c);
	}
	private void division(int a, int b) {
		float c;
		c = a/b;
		System.out.println("DIVISION of "+a+"/"+b+"="+c);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Advanced_Calculator obj = new Advanced_Calculator();
		System.out.println("Enter A:");
		int a = scan.nextInt();
		System.out.println("Enter B:");
		int b = scan.nextShort();
		System.out.println("Enter the number of the calculation needs to be performed from the below list:");
		System.out.println(" 1. ADD\n 2. SUB\n 3. MULTIPLY\n 4. DIVIDE");
		int S = scan.nextInt();
		if(S == 1) {
			obj.addition(a, b);
		}else if(S == 2) {
			obj.subtraction(a, b);
		}else if(S == 3) {
			obj.multiplication(a, b);
		}else {
			obj.division(a, b);
		}
	}
}
