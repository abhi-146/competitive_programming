package codeforces;

import java.util.Scanner;

public class Collecting_Coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();
			
			int max = Math.max(Math.max(a, b), c);
			a = max - a;
			b = max - b;
			c = max - c;
			
			n = n - (a + b + c);
			
			if(n % 3 == 0 && n >=0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}sc.close();
	}

}
