package com.stringfunctions;

public class String_Functions {
	
	public static void main(String[] args) {
		String A = "Jemimah";
		String B = "Devasugirtha";
		String C = "jemimah";
		String E = "Jeyapaul";
		String D = "JEMIMAH";
		String F = "JEMI";
		String J = "JEMIMAH DEVASUGIRTHA JEYAPAUL";
		String []S, s;
		
		System.out.println("Length of the string \'"+J+"\' : "+J.length());
		System.out.println("\'"+A+"\' equals \'"+C+"\' ? : "+A.equals(C));
		System.out.println("\'"+A+"\' equals \'"+C+"\' ? : "+A.equalsIgnoreCase(C));
		System.out.println("Changing \'"+D+"\' to lower case : "+D.toLowerCase());
		System.out.println("Changing \'"+B+"\' to upper case : "+B.toUpperCase());
		System.out.println("Finding the character present in index 1 in \'"+A+"\' : "+A.charAt(1));
		System.out.println("Finding the first index of letter \'J\' in \'"+J+"\' : "+J.indexOf('J'));
		System.out.println("Finding the last index of letter \'J\' in \'"+J+"\' : "+J.lastIndexOf('J'));
		System.out.println("Does \'"+J+"\' contains \'SUGIRTHA\' ? : "+J.contains("SUGIRTHA"));
		System.out.println("Does \'"+J+"\' contains \'SELVI\' ? : "+J.contains("SELVI"));
		System.out.println("Does \'"+J+"\' starts with \'JEMI\' ? : "+J.startsWith("JEMI"));
		System.out.println("Does \'"+J+"\' ends with \'PAUL\' ? : "+J.endsWith("PAUL"));
		System.out.println("Lets replace 'A' in \'"+J+"\' to '$' : "+J.replace('A','$'));
		System.out.println("Lets replace all space in \'"+J+"\' to '_' : "+J.replaceAll(" ","_"));
		System.out.println("Lets concatinate \'"+A+"\' with \'"+B+"\' : "+A.concat(B));
		
		S = F.split("");
		System.out.println("Splitting of \'"+F+"\' letter by letter: ");
		for (String string : S) {
			System.out.println(string);
		}System.out.println();
		s=J.split(" ");
		System.out.println("Splitting of \'"+J+"\' word by word: ");
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println("join string function: ");
		System.out.println(String.join(" ",A,B)); // syntax: String.join(char delimiter, char sequence(1), char sequence(2), ...,char sequence(n))
		//If we give only one char sequence(eg., String.join("A", "JAV")) the delimiter('A') wont get displayed as it will show only between two char sequences.
		System.out.println(String.join("A", "JAV")); //Delimiter- "A", char sequences- "JAV". NOTE: to display delimiter we should give minimum of 2 char sequences.
		System.out.println(String.join("V", "JA","A")); // Delimiter- "V", Char sequences- "JA", "A"
		System.out.println(String.join("_",A,B,E) ); //Delimiter- "_", Char sequences- A,B,E
		
	}
}
