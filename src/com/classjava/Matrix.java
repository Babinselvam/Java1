package com.classjava;

public class Matrix {
	public static void main(String[] args) {
		String str[][]= {{"hel","loj","ava"},{"hla","eov","lja"}};
		int row,col;
		System.out.println("the 2*3 matix characters are :");
		
		for(row=0;row<2;row++)
		{
			System.out.println("\n");
			for(col=0;col<3;col++)
			{
				System.out.print(str[row][col]+" ");
			}
				
		}
	}

}
