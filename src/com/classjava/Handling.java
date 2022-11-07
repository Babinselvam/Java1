package com.classjava;

public class Handling {
	public static void main(String[] args) throws Exception {
		String s="muthu";
		char c=s.charAt(9);
		try {
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("hello");
			
		}
		finally {
			System.out.println("hello");
		}
		for(int i=1;i<=10;i++) {
			if(i==5) {
				throw new Exception();
			}
			System.out.println(i);
		}
		
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	