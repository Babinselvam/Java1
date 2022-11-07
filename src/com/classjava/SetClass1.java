package com.classjava;
import java.util.TreeSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass1 {
	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
		
		s.add("jagan");
		s.add("babin");
		s.add("tamil");
		
		System.out.println(s);
		
		int s1 = s.size();
		System.out.println(s1);
		
		boolean c = s.contains("babin");
		System.out.println(c);
		
		//s.clear();
		//System.out.println(s);
		
Set<String> s2=new TreeSet<>();
		
		s2.add("muthu");
		s2.add("karthick");
		s2.add("shiva");
		System.out.println(s2);
		
		s2.addAll(s);
		System.out.println(s2);
		
		//s2.retainAll(s);
		//System.out.println(s2);
		
		s.removeAll(s2);
		System.out.println(s);
		
		
		
	}

}
