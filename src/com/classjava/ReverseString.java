package com.classjava;



public class ReverseString {
	public static void main(String[] args) {
		String s="java";
		String reverse=" ";
		
		for (int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
			
			
			
		}
		System.out.println("reverse of word="+reverse);
	}

}
