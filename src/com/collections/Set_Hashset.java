package com.collections;
import java.util.*;
import java.util.Map.Entry;

public class Set_Hashset {
	public static void main(String[] args) {
		
		Set <Integer> li = new HashSet<Integer>();
		HashSet <String> ls = new HashSet<String>();
		Set <String> lsclone = new HashSet<String>();
		li.add(101);
		li.add(101);
		li.add(103);
		li.add(105);
		ls.add("Vinisha");
		ls.add("Jemimah");
		ls.add("Asha");
		ls.add("Sathiya");
		System.out.println("Integer hashset: "+li);
		System.out.println("String hashset: "+ls);
//		In hashset we cannot add anything inbetween(add(index,value)). We cannot use get(), set(),sort
		lsclone = (HashSet)ls.clone();
		System.out.println("\nCloned sring hashset: "+lsclone);
		System.out.println("\nSize of the integer hashset: "+li.size());
		System.out.println("\nDoes list "+ls+" contains \"Vinisha\" ? : "+ls.contains("Vinisha"));
		System.out.println("\nIs integer & string hashset equal? "+li.equals(ls));
		System.out.println("\nIs integer hashset empty? "+li.isEmpty());
		li.remove(4);
		System.out.println("\nRemoving \"105\" from hashset: "+li);
		System.out.println("\nPrinting string hashset after converted into String: ");
		String Str = ls.toString();
		for (String string2 : ls) {
			System.out.println(string2);
		}
		ls.removeAll(ls);
		System.out.println("\nRemoved all entries in string hashset and checking \nIs String hashset empty now? "
		+ls.isEmpty());
		Object[] array = li.toArray();
		System.out.println("\nPrinting integer hashset after converted into array: ");
		for (Object O : array) {
			System.out.println(O);
		}
	}
}
