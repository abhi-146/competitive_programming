package codeforces;

import java.util.Scanner;

public class Add_Odd_or_Subtract_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if( b > a)
			{
				if((b - a) % 2 == 1)
					System.out.println("1");
				else
					System.out.println("2");
			}
			else if (a > b)
			{
				if((a - b) % 2 == 0)
					System.out.println("1");
				else
					System.out.println("2");
			}
			else
			{
				System.out.println("0");
			}
		}
	}

}
