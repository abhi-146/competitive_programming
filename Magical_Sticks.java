package codeforces;

import java.util.Scanner;

public class Magical_Sticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			
			int ans = ((n & 1) == 1) ? n/2: n/2 - 1;
			
			System.out.println(ans + 1);
		}
	}

}
