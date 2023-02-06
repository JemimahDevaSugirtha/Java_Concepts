package com.programs;
import java.util.Scanner;
public class Mark {
	void stdnt (String a)
	{
		System.out.println("Name of the Student: "+a);
	}

	void stdnt (short a)
	{
		System.out.println("ID of the Student: "+a);
	}

	void stdnt (int n)
	{
		System.out.println("Phone number of the Student: "+n);
	}

	void stdnt (long a)
	{
		if((a>=0)&&(a<=100))
		{
		System.out.println("Mark of the Student: "+a+"/500");
		System.out.println("Student Grade: F");
		}else if((a>=101)&&(a<=300))
		{
		System.out.println("Mark of the Student: "+a+"/500");
		System.out.println("Student Grade: C");
		}else if((a>=301)&&(a<=400))
		{
		System.out.println("Mark of the Student: "+a+"/500");
		System.out.println("Student Grade: B");
		}else if((a>=401)&&(a<=450))
		{
		System.out.println("Mark of the Student: "+a+"/500");
		System.out.println("Student Grade: A");
		}else if((a>=456)&&(a<=500))
		{
		System.out.println("Mark of the Student: "+a+"/500");
		System.out.println("Student Grade: O");
		}else
		{
		System.out.println("Invalid mark");
		}
	}
 
	public static void main(String []args)
	{
		
		Mark m = new Mark();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name: ");
		String s = sc.nextLine();
		System.out.println("Enter Student ID: ");
		short sh = sc.nextShort();
		System.out.println("Enter Student Phone number: ");
		int i = sc.nextInt();
		System.out.println("Enter Student mark out of 500: ");
		long l = sc.nextLong();
		System.out.println("STUDENT DETAILS");
		m.stdnt (s);
		m.stdnt (sh);
		m.stdnt (i);
		m.stdnt (l);
	}
}
	
