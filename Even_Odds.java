package codeforces;

import java.util.Scanner;

public class Even_Odds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long x =( n % 2 == 0 )? n/2: n/2 + 1; 
		
		if(k <= x)
		{
			System.out.print(1 + (k - 1)*2);
		}
		else
			System.out.print(2 + (k - x - 1)*2);
		
		sc.close();
	}

}
