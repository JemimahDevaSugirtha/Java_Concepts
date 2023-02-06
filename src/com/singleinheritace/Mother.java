package com.singleinheritace;

public class Mother extends Father {
	
	private void juice() {
		System.out.println("Watermelon juice");

	}
	
	private void Food() {
		System.out.println("Mutton Biryani");

	}

	public static void main(String[] args) {
		
		Mother eat = new Mother();
		
		eat.cake();
		eat.chocolate();
		eat.Food();
		eat.juice();

	}
}
