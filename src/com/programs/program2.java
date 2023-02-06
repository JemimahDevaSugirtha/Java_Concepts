package com.programs;

import java.util.*;
import java.util.Map.Entry;

public class program2 {
public static void main(String[] args) {
	String s = "of the people by the people for the people";
	String [] words = s.split(" ");
	Map<String,Integer> map = new LinkedHashMap<>();
	
	for (String word : words) {
		if(map.containsKey(word)){
			map.put(word, map.get(word)+1);
		}else {
			map.put(word, 1);
		}
		}
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if (entry.getValue()>1) {
			System.out.println(entry);			
		}
	}
	}

}
