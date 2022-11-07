package com.classjava;

public class MethodOverRiding extends MethodOverLoading {
	public void studentname(String name) {
		super.studentname(name);
	}
	public void studentid(int id) {
		super.studentid(id);
	}
	public void studentnumber(long number) {
		super.studentnumber(number);
	}
	public void studentmailid(String mailid) {
		super.studentmailid(mailid);
	}
	public void studentaddress(double address) {
		super.studentaddress(address);
	}
	public static void main(String[] args) {
		MethodOverRiding s=new MethodOverRiding();
		s.studentname("babin");
		s.studentid(10);
		s.studentnumber(7904866675l);
		s.studentmailid("babinselvam08@gmail.com");
		s.studentaddress(600087d);
	}
	

}
