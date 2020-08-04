package codeforces;

import java.util.Scanner;

public class Construct_The_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int i = 0;
			
			while(n-- > 0)
			{
				System.out.print((char)((i++ % b)+ 97));
			}
			System.out.println();
			
		}
		sc.close();
	}

}
