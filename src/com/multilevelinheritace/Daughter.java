package com.multilevelinheritace;

public class Daughter extends Mother {
	
	private void snacks() {
		System.out.println("Nachos");

	}
	
	public static void main(String[] args) {
		Daughter eat = new Daughter();
		eat.cake();
		eat.chocolate();
		eat.Food();
		eat.juice();
		eat.snacks();
	}
	

}
