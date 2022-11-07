package org.lang;

public class StudentDetails extends LanguageInfo {
	public void southIndia() {
		System.out.println("tamil");
	}
	public void northIndia() {
		System.out.println("hindi");
	}
	public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		s.northIndia();
		s.southIndia();
	}

}
