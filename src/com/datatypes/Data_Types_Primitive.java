package com.datatypes;

public class Data_Types_Primitive {
	
	public static void main(String[] args) {
		System.out.println("PRIMITIVE DATATYPES");
		byte B = 123;
		System.out.println("BYTE: \n"+B+"\nAccepts upto 3 digit values\n");
		
		short S = 12345;
		System.out.println("SHORT: \n"+S+"\nAccepts upto 5 digit values\n");
		
		int I = 1234567890;
		System.out.println("INT: \n"+I+"\nAccepts upto 10 digit values\n");
		
		long L = 1234567890111565636l;
		System.out.println("LONG: \n"+L+"\nAccepts any no. of values with the specification of alphabet 'l' in the last\n");
		
		float F1 = 3000000f;
		float F2 = 3000000000f;
		float F3 = 1234567898f;
		float F4 = 2.23456789f;
		System.out.println("FLOAT: \n"+"\n F1 = 3000000f = "+F1+"\n F2 = 3000000000f = "+F2+"\n F3 = 1234567898f = "+F3+"\n F4 = 2.23456789f = "+F4+"\n");
		//Accepts any no. of values with the specification of alphabet 'f' in the last.
		//LOGIC: It Shows upto 7 decimal digits and after that exponents(E9) is shown, that is the decimal will be moved to the left so it will show how many decimal it moved to the left.
	
		double D1 = 123456787342121237d;
		double D2 = 2.232476287645678985235235;
		System.out.println("DOUBLE: \n"+"\n D1 = 123456787342121237d = "+D1+"\n D2 = 2.232476287645678985235235 = "+D2+"\n");
		//Accepts any no. of values with the specification of alphabet 'd' in the last. 
		//LOGIC: It Shows upto 16 decimal digits and after that exponents(E9) is shown, that is the decimal will be moved to the left so it will show how many decimal it moved to the left.
		
		char C = 'J';
		System.out.println("CHAR: \n"+C+"\nAccepts only 1 character\n");
		
		boolean b;
		int a = 11; int c = 12;
		b = a>c;
		System.out.println("BOOLEAN: \n"+a+">"+c+"="+b+"\ndisplayes whether true or false\n");
	}

}
