package com.classjava;

public class This extends Super {
	int i=20;
	public void key() {
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		This s=new This();
		s.key();
	}

}
