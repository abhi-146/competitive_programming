package codeforces;

import java.util.Scanner;

public class Beautyful_Matrix {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int row =0;
		int column = 0;
		for(int i = 1;i<6;i++)
			for(int j = 1;j<6;j++)
			{
			
				if(sc.nextInt() == 1)
				{
					row = j;
				    column = i;
				}
					
			}
		System.out.print(Math.abs(3 - row) + Math.abs(3 - column));
	}

}
