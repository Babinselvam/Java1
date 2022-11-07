package org.college;

public class Hostel extends Student {
	public void hostelname() {
		System.out.println("Boys Hostel");
	}
	public static void main(String[] args) {
		Hostel s=new Hostel();
		s.collegename();
		s.collegecode();
		s.collegerank();
		s.studentname();
		s.studentDept();
		s.studentid();
		s.hostelname();
	}
	 

}
