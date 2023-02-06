package com.partialabstraction;

public abstract class Abstract_Parent {
		
	public abstract void tamil();
	
	public abstract void english(String topic);
	
	public void maths() {
		
		System.out.println("Maths: Algebra");

	}
	
	public void Social(String lesson) {
		
		System.out.println("Social: "+ lesson);

	}
	
	public static void main(String[] args) {
		
		//upcasting
		Abstract_Parent abs = new Child();
		abs.tamil();
		abs.english("Grammar");
		abs.maths();
		abs.Social("Revolution");
	}
	

}
