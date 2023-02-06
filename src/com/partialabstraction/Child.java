package com.partialabstraction;

public class Child extends Abstract_Parent{

	@Override
	public void tamil() {
		System.out.println("Tamil: Literature");
	}

	@Override
	public void english(String topic) {
		System.out.println("English: "+topic);
	}
	
	@Override
	public void Social(String lesson) {
		super.Social(lesson);
	}
	
	private void science() {
		System.out.println("Science: Human anatomy");
	}
	
	public static void main(String[] args) {
		Child abs = new Child();
		abs.tamil();
		abs.english("Poem");
		abs.maths();
		abs.Social("World war-II");
		abs.science();
	}
}
