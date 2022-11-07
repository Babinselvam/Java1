package com.classjava;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapClass1 {
	public static void main(String[] args) {
		Map<Integer , String> s=new TreeMap<>();
		
		s.put(3, "guna");
		s.put(8, "zara");
		s.put(1, "raja");
		s.put(5, " ");
		System.out.println(s);
		
		int s1 = s.size();
		System.out.println(s1);
		
		String st = s.get(8);
		System.out.println(st);
		
		Set<Integer> ks = s.keySet();
		System.out.println(ks);
		
		Collection<String> v = s.values();
		System.out.println(v);
		
		boolean c = s.containsKey(9);
		System.out.println(c);
		
		boolean cv = s.containsValue("guna");
		System.out.println(cv);
		
		Set<Entry<Integer, String>> es = s.entrySet();
		System.out.println(es);
	}

}
