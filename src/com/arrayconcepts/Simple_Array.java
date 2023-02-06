package com.arrayconcepts;

import java.util.Scanner;

public class Simple_Array {
	
	public static void main(String[] args) {
		
		//single dimension
		String []S = {"Gnanaselvi","Ponmalar","Jeyapaul"};
		System.out.println(S[1]);
		System.out.println();
		String A[] = new String[3];
		A[0] = "Jemimah";
		A[1] = "Devasugirtha";
		A[2] = "Jeyapaul";
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		System.out.println();
		//getting input string and storing in array
		String B[] = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("input any string of 3 words/letters: ");
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextLine();
		}
		System.out.println("Output: ");
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}
	
}
