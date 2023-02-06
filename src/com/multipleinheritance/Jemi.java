package com.multipleinheritance;

public class Jemi extends Shop_3 implements Shop_1,Shop_2 {
	
	@Override
	public void fruits_Shop() {
		System.out.println("Watermelon");
	}
	
	
	@Override
	public void Thalapakatti() {
		System.out.println("Biryani");
	}
	
	private void cook() {
		System.out.println("Mutton stew");
	}
	
	public static void main(String[] args) {
		
		Jemi use = new Jemi();
		
		use.fruits_Shop();
		use.Thalapakatti();
		use.fast_Food();
		use.cook();
		
	}

}
