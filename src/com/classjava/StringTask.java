package com.classjava;

public class StringTask {
	public static void main(String[] args) {
		String str="This#string%contains^special*characters&";
		String r = str.replace(" ", "#");
		System.out.println(r);
	
	}

}
