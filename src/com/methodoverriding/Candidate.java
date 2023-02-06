package com.methodoverriding;

public class Candidate extends Amazon_Company{
	
	 @Override
	public void ctc() {
		 
		 System.out.println("Expected Salary Package: 10L");
		//super.ctc();
	}
	 
	 @Override
	public void doj(String s) {
		 
		super.doj(s);
	}
	 
	 public static void main(String[] args) {
		
		 Candidate exp =new Candidate();
		 
		 exp.ctc();
		 exp.doj("Oct19,2022");
		 
	}

}
