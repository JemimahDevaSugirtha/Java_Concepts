package com.operators;

import java.util.Scanner;

public class Arithmetic_Operators {
	
	public static void main(String[] args) {
		
		int a = 10, b = 2;
		System.out.println("A = "+a+"\nB = "+b);
		System.out.println("ADD: "+(a+b));
		System.out.println("SUB: "+(a-b));
		System.out.println("MULTIPLY: "+(a*b));
		System.out.println("DIVIDE(QUOTIENT): "+(a/b));
		System.out.println("DIVIDE/MODULUS(REMAINDER): "+(a%b));
		System.out.println("PRE-INCREMENT: "+(++a));
		//post increment (increments after next time called. this is used in loop statements)
		System.out.println("POST-INCREMENT: "+(a++));
		System.out.println("PRE-DECREMENT: "+(--b));
		//post decrement (decrements after next time called. this is used in loop statements)
		System.out.println("POST-DECREMENT: "+(b--));
		
		
		//difference between next() & nextLine()
		Scanner sc = new Scanner(System.in);
		
		//eg for "nextLine()" where string after space will also displayed with the current input.
		System.out.println("\n\nEnter first & last name: ");
		System.out.println("First & Last name: "+sc.nextLine());
		
		//eg for "next()" where after string given after space will be assigned to next input
		System.out.println("Enter Brother's name: ");
		System.out.println("First name: "+sc.next());
		System.out.println("Last name: "+sc.next());
		
	}

}
