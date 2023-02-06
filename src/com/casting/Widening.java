package com.casting;

public class Widening {
	
	public static void main(String[] args) {
		
		//byte -> short
		byte b = 10;
		short s = b;
		System.out.println("byte -> short "+s);
		
		//short -> int
		short s1 = 7;
		int i = s1;
		System.out.println("short -> int "+i);
		
		//int -> long
		int i1 = 8;
		long l = i1;
		System.out.println("int -> long "+l);
		
		//float -> double
		float f = 2.312343223f;
		double d = f;
		System.out.println("double -> float "+d);
		
		//SELF NOTE: we cannot convert char to string.
		
	}

}
