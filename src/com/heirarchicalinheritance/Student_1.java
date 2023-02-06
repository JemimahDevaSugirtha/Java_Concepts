package com.heirarchicalinheritance;

public class Student_1 extends Subject{
	
	private void vinisha() {
		System.out.println("I love these subjects");

	}
	
	public static void main(String[] args) {
		
		Student_1 like = new Student_1();
		
		like.vinisha();
		like.english();
		like.maths();
		like.science();
	}

}
