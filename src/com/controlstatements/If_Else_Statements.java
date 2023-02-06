package com.controlstatements;
import java.util.Scanner;
public class If_Else_Statements {
	static int age;
	public If_Else_Statements() { //non-parameterized constructor
		System.out.println("!Welcome to the voting system!");
	}
	
	public If_Else_Statements(int a) { //parameterized constructor & If-else statement
		age = a;
		if (age>=18) {
			System.out.println("Congrats!, You are eligible for voting\n");		
		} else {
			System.out.println("Sorry!, You not are eligible for voting\n");} 
	}
	
	public void nested_If_Else(int ward) { //nested if-else statements
		for (int i = 0; i < 5; ) {
			if (age<18) { break;
			} else {
					if ( (ward > 0)&& (ward<=25)) { 
						System.out.println("Please vote in the room: 21\n");break;
					}else if((ward > 25)&& (ward<=50)){ 
						System.out.println("Please vote in the room: 24\n"); break;
					}else if((ward > 50)&& (ward<=100)){ 
						System.out.println("Please vote in the room: 27\n"); break;
					}else { 
						System.out.println("Please vote in the room: 30\n"); break; 
					}
			}
		}
	}
	
	private String voting(String vote) { //return method
		if (vote.equals("yes") || vote.equals("Yes")||vote.equals("YES")) {
			vote = "VOTING SUCCESSFUL\n";	
		}
		if (vote.equals("no") || vote.equals("No")||vote.equals("NO")) {
			vote = "VOTING UNSUCCESSFUL\n";
		}
		return(vote);
	}
	
	public static void main(String[] args) {
		If_Else_Statements v = new If_Else_Statements();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Age: ");
		new If_Else_Statements(sc.nextInt());
		String s = (age<18)?"YES":"NO"; //shorthand if-else(ternary)
		if(s.equals("YES")) { 
			System.out.println("Thank you for coming!");
		}else {
			System.out.println("Please Enter your ward no between 1 to 100: ");
			v.nested_If_Else(sc.nextInt());
			System.out.println("Did you voted? (yes/no)");
			String S = v.voting(sc.next());
			System.out.println(S);
			System.out.println("Thank you!");
		}
	}
}
