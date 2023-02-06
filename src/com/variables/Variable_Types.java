package com.variables;
public class Variable_Types {
	
	//Class variables
	int I;
	int o = 12;
	String S;
	String J = "Monster";
	static int a =5; //static variable
	final String JJ = "Jemimah"; //Final variable
	
	private void block1() {
		
		I = 7;
		byte b = (byte) o; //Class variable got narrowed with Local variable
		a = 0;  //assigning value for static variable
		S = "Park";
		J = "Hope";
		float f = 2.7f;  //local variable
		// JJ = "Devasugirtha"; //Final variable value cannot be changed
		
		System.out.println("class int variable: "+I);
		System.out.println("Class int variable got narrowed with Local byte variable: "+b);
		System.out.println("Static variable value inside the method "+a);
		System.out.println("class String variable: "+S);
		System.out.println("Local float variable: "+f);
		System.out.println("Class string variable: "+J);
		System.out.println("Final variable inside method: "+JJ);
	}
	
	public static void main(String[] args) {
		
		Variable_Types var = new Variable_Types();
		System.out.println("Static variable value outside the method: "+a);
		System.out.println("Final variable value outside method: "+ var.JJ);
		var.I = 10; //class variable called & assigned value inside main method
		var.block1();
	}
}
