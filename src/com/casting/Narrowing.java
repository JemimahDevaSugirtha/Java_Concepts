package com.casting;

public class Narrowing {
	
	public static void main(String[] args) {
		
		//long -> int
		long l = 1232346875;
		int i = (int) l;
		System.out.println("long -> int "+i);
		
		// double -> float
		double d = 2.56564465776322112313323;
		float f = (float) d;
		System.out.println("double -> float "+f);
		
	}

}
