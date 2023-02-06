package com.methodoverloading;

public class Amazon_Company {
	
	private void Amazon() {
		System.out.println("Company name	: Amazon.in");
	}
	
	private void Amazon(int emp_id) {
		System.out.println("Emp ID		: "+emp_id);
	}
	
	private void Amazon(String first, String last, char initial) {
		System.out.println("Employee name	: "+last+", "+first+" "+initial);
	}

	private void Amazon(long phone) {
		System.out.println("Phone number	: "+phone);
	}
	
	private void Amazon(float salary) {
		System.out.println("Salary per month: "+salary);
	}
	
	private void Amazon(double salary) {
		System.out.println("Salary per annum: "+salary);
	}
	
	public static void main(String[] args) {
		Amazon_Company deets = new Amazon_Company();
		
		deets.Amazon();
		deets.Amazon(749765);
		deets.Amazon("Jemimah", "Devasugirtha", 'J');
		deets.Amazon(8926427540l);
		deets.Amazon(36000.02f);
		deets.Amazon(490000d);
	}




}
