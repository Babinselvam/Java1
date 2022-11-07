package com.classjava;

public class B1class implements Method {
	public void studentname() {
		System.out.println("babin");
	}
	public void studentid() {
		System.out.println(10);
	}
	public void studentsec() {
		System.out.println('A');
	}
	public void studentpercentage() {
		System.out.println(88.5);
	}
	public static void main(String[] args) {
		B1class s=new B1class();
		s.studentname();
		s.studentid();
		s.studentsec();
		s.studentpercentage();
	}

}
