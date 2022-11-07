package com.classjava;


import java.util.Scanner;

public class ScannerClass {
	
	public class Matrix{
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		
		int arr[][]= new int[3][3];
		System.out.println("enter the 3*3 matrix elements :");
		int row,col;
		for (row=0; row<3; row++)
		for (col=0; col<3; col++)
			arr[row][col]=
			s.nextInt();
		System.out.println("The 3*3 matrix elements are:");
		for(row=0; row<3; row++) {
			System.out.println("\n");
			for(col=0; col<3; col++) {
				System.out.println(arr[row][col]+" ");
			}
		}
		
			
			
		}
	}
		
	}


