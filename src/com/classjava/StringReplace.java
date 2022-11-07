package com.classjava;

public class StringReplace {
	public static void main(String[] args) {
		
		String s="5-35-2a";
		String s1="venkatesh nivas";
		String s2="Arupukottai";
		String s3="pincode-626101";
		
		String l=s.toLowerCase();
		System.out.println(l);
		
		String l1=s1.toLowerCase();
		System.out.println(l1);
		
		String l2=s2.toLowerCase();
		System.out.println(l2);
		
		
		String r=s3.replace("pincode-626101", " ");
		System.out.println(r);
	}

}
