package com.classjava;

import java.util.LinkedList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		List<Integer> s= new LinkedList<>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		
		int s1 = s.size();
		System.out.println(s1);
		
		Integer i = s.get(2);
		System.out.println(i);
		
		int io = s.indexOf(3);
		System.out.println(io);
		
		boolean c = s.contains(2);
		System.out.println(c);
		
		s.set(1, 5);
		System.out.println(s);
		
		//s.remove(0);
		//System.out.println(s);
		
		//s.clear();
		//System.out.println(s);
		
		List<Integer> s2= new LinkedList<>();
		
		s2.add(4);
		s2.add(5);
		s2.add(6);
		System.out.println(s2);
		
		s2.addAll(s);
		System.out.println(s2);
		
		s2.retainAll(s);
		System.out.println(s2);
		
		
		
//	s.removeAll(s2);
	//System.out.println(s);
}
}