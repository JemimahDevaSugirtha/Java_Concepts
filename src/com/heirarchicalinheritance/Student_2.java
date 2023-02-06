package com.heirarchicalinheritance;

public class Student_2 extends Subject{

	private void asha() {
		System.out.println("I love these subjects");

	}
	
	public static void main(String[] args) {
		
		Student_2 like = new Student_2();
		
		like.asha();
		like.tamil();
		like.social();
	}

}
