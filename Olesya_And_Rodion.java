package codeforces;

import java.util.Scanner;

public class Olesya_And_Rodion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		if(t == 10)
		{
			if(n <2)
			{
				System.out.print("-1");
			}
			else
				
			{
				System.out.print("1");
				n--;
				while(n-- >0)
					System.out.print("0");

			}
					}
		else
		{
			while(n-- > 0)
				System.out.print(t);
		}
		
	}

}
