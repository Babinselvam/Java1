package com.classjava;

public class Bclass extends StudentDetails{
	public void studentaddress() {
		System.out.println("chennai");
	}
	public static void main(String[] args) {
		Bclass s=new Bclass();
		s.studentname();
		s.studentid();
		s.studentrollno();
		s.studentaddress();
	}
}

