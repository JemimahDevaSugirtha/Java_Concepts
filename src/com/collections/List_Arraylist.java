package com.collections;

import java.util.*;

public class List_Arraylist {
	public static void main(String[] args) {
		
		List <Integer> li = new LinkedList<Integer>();
		List <String> ls = new LinkedList<String>();
		li.add(101);
		li.add(101);
		li.add(103);
		li.add(105);
		ls.add("Vinisha");
		ls.add("Jemimah");
		ls.add("Asha");
		ls.add("Sathiya");
		System.out.println("Integer linkedList: "+li);
		System.out.println("String linkedlist: "+ls);
		li.add(3,104);
		ls.add(4,"Prithesha");
		System.out.println("\nInteger linkedList after adding in the middle: "+li);
		System.out.println("\nString arraylist after adding in the middle: "+ls);
		System.out.println("\nSize of the integer linkedlist: "+li.size());
		System.out.println("\nFinding the first index of letter \"101\" in "+li+" : "+li.indexOf(101));
		System.out.println("\nFinding the last index of letter \"101\" in "+li+" : "+li.lastIndexOf(101));
		System.out.println("\nDoes list "+ls+" contains \"Vinisha\" ? : "+ls.contains("Vinisha"));
		String string = ls.get(1);
		System.out.println("\nGetting value from string linkedlist: "+string);
		Integer set = li.set(1, 102);
		System.out.println("\nSetting value \""+set+"\" in integer linkedlist: "+li);
		System.out.println("\nIs integer & string linkedlist equal? "+li.equals(ls));
		System.out.println("\nIs integer linkedlist empty? "+li.isEmpty());
		Integer remove = li.remove(4);
		System.out.println("\nRemoving \""+remove+"\" from linkedlist: "+li);
		Collections.sort(ls);
		System.out.println("\nString arraylist after sorting: "+ls);
		System.out.println("\nPrinting string linkedlist after converted into String: ");
		String Str = ls.toString();
		for (String string2 : ls) {
			System.out.println(string2);
		}
		Collections.sort(ls);
		System.out.println("\nString arraylist after sorting: "+ls);
		ls.removeAll(ls);
		System.out.println("\nRemoved all entries in string linkedlist and checking \nIs String linkedlist empty now? "+ls.isEmpty());
		Object[] array = li.toArray();
		System.out.println("\nPrinting integer linkedlist after converted into array: ");
		for (Object O : array) {
			System.out.println(O);
		}
	}
}
