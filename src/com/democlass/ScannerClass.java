package com.democlass;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the name");
		String n=s.next();
		System.out.println(n);
		
		System.out.println("enter the name");
		String n1=s.nextLine();
	    System.out.println(n1);
	    
	    System.out.println("enter the number");
	    int i=s.nextInt();
	    System.out.println(i);
	    
	    System.out.println("enter the salary");
	    float f=s.nextFloat();
	    System.out.println(f);
	    
	    System.out.println("enter the sec");
	    char c=s.next().charAt(0);
	    System.out.println(c);
	    
	    System.out.println("enter the date");
	    byte b=s.nextByte();
	    System.out.println(b);
	    
	    System.out.println("enter the month");
	    short s1=s.nextShort();
	    System.out.println(s1);
	    
	    System.out.println("enter the phone number");
	    long l=s.nextLong();
	    System.out.println(l);
	    
	    System.out.println("enter the time");
	    double d=s.nextDouble();
	    System.out.println(d);
	    
	    System.out.println("enter the dep");
	    String s3=s.toString();
	    System.out.println(s3);
	    
	    System.out.println("enter true");
	    boolean b1=s.nextBoolean();
	    System.out.println(b1);
	
	
	
	
	
	}

}
