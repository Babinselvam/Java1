package com.classjava;

import java.util.HashMap;
import java.util.Map;

public class RepeatWord {
	public static void main(String[] args) {
		 String s="fear leads to anger anger leads to hatred hatred leads to conflict";
		 String[] sp = s.split(" ");
		 Map<String, Integer> m=new HashMap<String, Integer>();
		 System.out.println(m);
		 for (String str : sp) {
			 if (m.containsKey(str)) {
				  Integer i = m.get(str);
				  m.put(str, i+1);
				  
				
			} else {
				m.put(str, 1);
				

			}
			
		}
		 System.out.println(m); 
	}

}
