package com.democlass;

public class StringMethod {
	public static void main(String[] args) {
		String s="Hello_Java";
		String s1="hello Java";
		
		String r=s.replace("Hello", "Welcome");
		System.out.println(r);
		
		String q=s.substring(4);
		System.out.println(q);
		
		boolean e=s.isEmpty();
		System.out.println(e);
		
		String t=s.trim();
		System.out.println(t);
		
		String u=s.substring(5, 8);
		System.out.println(u);
		
		System.out.println("A:");
		for (String str :s.split("_")) {
			System.out.println(str);
			
		}
		
	}

}
