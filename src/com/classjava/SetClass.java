package com.classjava;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		int s1 = s.size();
		System.out.println(s1);
		
		boolean c = s.contains(3);
		System.out.println(c);
		
		s.clear();
		System.out.println(s);
		
Set<Integer> s2=new LinkedHashSet<>();
		
		s2.add(4);
		s2.add(5);
		s2.add(6);
		System.out.println(s2);
		
		s2.addAll(s);
		System.out.println(s2);
		
		s2.retainAll(s);
		System.out.println(s2);
		
		s.removeAll(s2);
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
