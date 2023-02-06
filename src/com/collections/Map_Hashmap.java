package com.collections;
import java.util.*;
import java.util.Map.Entry;

public class Map_Hashmap {
	public static void main(String[] args) {
		Map <Integer,Integer> mii =new HashMap<>();
		Map <String,String> mss =new HashMap<String,String>();
		Map <Integer,String> mis =new HashMap<Integer,String>();
		Map <String,Integer> msi =new HashMap<String,Integer>();
		mii.put(1, 101); mii.put(2, 101); mii.put(3, null); mii.put(5, 104);
		
		mss.put("a", "Jemi"); mss.put("b", "Vinisha"); mss.put("c", null); mss.put("d", "Asha");
		
		mis.put(0, "Hobi"); mis.put(1, "Joon");
		
		msi.put("z", 7);
		
		System.out.println("Integer-Integer Hashmap: "+mii);
		System.out.println("String-String Hashmap: "+mss);
		System.out.println("Integer-String Hashmap: "+mis);
		System.out.println("String-Integer Hashmap: "+msi);
		System.out.println("\nSize of the I-I Hashmap: "+mii.size());
		System.out.println("\nDoes list "+mss+" contains value \"Vinisha\" ? : "+mss.containsValue("Vinisha"));
		System.out.println("\nDoes list "+mii+" contains key \"4\" ? : "+mii.containsKey(4));
		msi.clear();
		System.out.println("\nCleared out the S-I hashmap: "+msi);
		System.out.println("\nIs S-I Hashmap empty? "+msi.isEmpty());
		Integer remove = mii.remove(3);
		System.out.println("\nRemoving \""+remove+"\" from I-I hashmap: "+mii);
		mss.replace("c", "Sathiya");
		System.out.println("\nReplacing \"Null\" from S-S hashmap: "+mss);
		System.out.println("\nDisplaying only the keys of I-I hashmap:");
		Set<Integer> keySet = mii.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		System.out.println("\nDisplaying only the values of S-S hashmap:");
		Collection<String> values = mss.values();
		for (String string : values) {
			System.out.println(string);
		}
		System.out.println("\nDisplaying the entryset of I-S hashmap:");
		Set<Entry<Integer, String>> entrySet = mis.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}
	}

}
