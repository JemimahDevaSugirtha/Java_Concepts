package com.programs;

public class String_Fn {
	
	public static void main(String[] args) {
		String a = "data";
		String b = "flow";
		a = a+b;
		b = a.substring(0, a.length()- b.length());
		a = a.substring(b.length());
		System.out.println(a+b);
	}
}
