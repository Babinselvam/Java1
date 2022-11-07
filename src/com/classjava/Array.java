package com.classjava;

public class Array {
	public static void main(String[] args)  {
		
		StringBuilder s = new StringBuilder("babin");
		System.out.println(System.identityHashCode(s));
		
		StringBuilder s1 = new StringBuilder("babin");
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s.append(s1)));
		
		

}
}
