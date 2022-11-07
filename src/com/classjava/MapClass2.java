package com.classjava;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass2 {
	public static void main(String[] args) {
		Hashtable<Integer , String> s=new Hashtable<>();
		
		s.put(4, "b");
		s.put(8, "a");
		s.put(5, "s");
		System.out.println(s);
		
		int s1 = s.size();
		System.out.println(s1);
		
		String st = s.get(8);
		System.out.println(st);
		
		Set<Integer> ks = s.keySet();
		System.out.println(ks);
		
		Collection<String> v = s.values();
		System.out.println(v);
		
		boolean ck = s.containsKey(4);
		System.out.println(ck);
		
		boolean cv= s.containsValue("g");
		System.out.println(cv);
		
		Set<Entry<Integer, String>> es = s.entrySet();
		System.out.println(es);
		
	}

}
