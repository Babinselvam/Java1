package com.classjava;

public class StudentEnq {
	public StudentEnq(String address) {
		System.out.println(address);
	}
	public StudentEnq(long no) {
		System.out.println(no);
	}
	public StudentEnq(float salary) {
		System.out.println(salary);
	}
	public static void main(String[] args) throws Throwable {
		StudentEnq s=new StudentEnq("chennai");
		StudentEnq s1=new StudentEnq(7904866675l);
		StudentEnq s2=new StudentEnq(10000f);
		s.finalize();
		s.finalize();
		s.finalize();
		
	}

}
