package codeforces;

import java.util.Scanner;

public class Required_Remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int n = sc.nextInt();
		
			
				int ans = n - (n % x) + (y);
			
				System.out.println((ans > n)? ans - x : ans);
		}
	}

}
