package com.classjava;

import java.util.Scanner;

public class ScannerDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter the name");
	String n = s.next();
	System.out.println(n);
	
	System.out.println("enter the id");
	int i = s.nextInt();
	System.out.println(i);
	
	System.out.println("enter the salary");
	float f = s.nextFloat();	
	System.out.println(f);
	
	System.out.println("enter the phonenumber");
	long l = s.nextLong();
	System.out.println(l);
	
	System.out.println("enter the date");
	byte b = s.nextByte();
	System.out.println(b);
	
	System.out.println("enter the address");
	String s1 = s.next().toString();
	}

}
