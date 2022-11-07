package com.classjava;

public class Palindrome {
	public static void main(String[] args) {
		String str="radix",rverseStr=" ";
		int strlength=str.length();
		for(int i=str.length()-1;i>=0;i--);
		reverseStr = reverseStr + str.charAt(i);
	
	if(str.tolowercase().equals(reverseStr.tolowercase())) {
		System.out.println(str + "is a palindrome string");
	}
	else {
		System.out.println(str + "is not a palindrome");
	}
		
	}
	

}
