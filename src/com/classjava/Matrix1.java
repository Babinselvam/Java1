package com.classjava;

public class Matrix1 {
	public static void main(String[] args) {
		
		String str="hello java";
		
		String[] strArray=null;
		strArray=str.split(" ");
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
			
			for(int j=0;j<strArray.length;j++) {
				System.out.println(strArray[j]);
				
			}
		}
	}

}
