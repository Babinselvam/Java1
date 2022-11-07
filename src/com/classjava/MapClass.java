package com.classjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass {
	public static void main(String[] args) {
		HashMap<Integer , String> s=new LinkedHashMap<>();
		
		s.put(4, "babin");
		s.put(5, "selvam");
		s.put(6, "jagan");
		System.out.println(s);
		
		int s1 = s.size();
		System.out.println(s1);
		
		String st = s.get(5);
		System.out.println(st);
		
		Set<Integer> k = s.keySet();
		System.out.println(k);
		
		Collection<String> v = s.values();
		System.out.println(v);
		
		boolean c = s.containsKey(5);
		System.out.println(c);
		
		boolean cv = s.containsValue("jagan");
		System.out.println(cv);
		
		Set<Entry<Integer, String>> es = s.entrySet();
		System.out.println(es);
	}

}
