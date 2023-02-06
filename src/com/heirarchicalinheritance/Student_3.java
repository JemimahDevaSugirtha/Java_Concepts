package com.heirarchicalinheritance;

public class Student_3 extends Subject {

	private void sathiya() {
		System.out.println("I love these subjects");

	}
	
	public static void main(String[] args) {
		
		Student_3 like = new Student_3();
		
		like.sathiya();
		like.social();
		like.science();
	}

}
