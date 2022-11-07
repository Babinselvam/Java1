package org.college;

public class Student extends College {
	public void studentname() {
		System.out.println("babin");
	}
	public void studentDept() {
		System.out.println("EEE");
	}
	public void studentid() {
		System.out.println(10);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegename();
		s.collegecode();
		s.collegerank();
		s.studentname();
		s.studentDept();s.studentid();
	}
	

}
